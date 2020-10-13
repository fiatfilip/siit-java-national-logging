package ro.tema.junit;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static Map<String, Integer> unitsOrder = new HashMap<>();
    private static Map<Integer, Integer> units = new HashMap<>();
    private static Map<Integer,String> unitsString = new HashMap<>();
    static {
        unitsOrder.put("mm", 0);
        unitsOrder.put("cm",1);
        unitsOrder.put("dm",2);
        unitsOrder.put("m",3);
        unitsOrder.put("km",4);
        units.put(0, 1);
        units.put(1, 10);
        units.put(2, 100);
        units.put(3, 1000);
        units.put(4, 1000 * 1000);
        unitsString.put(0, "mm");
        unitsString.put(1, "cm");
        unitsString.put(2, "dm");
        unitsString.put(3, "m");
        unitsString.put(4, "km");
    }
    public static String calculate(String expression) {
        String expr = expression.trim();
        if (expr.charAt(0) != '-') {
            expr = "+ " + expr;
        }
        String exprSplitted[] = expr.split(" ");
        int calcul = 0;
        int minUnit = 4;
        for (int i = 0; i < exprSplitted.length; i = i + 3) {
            String semn = exprSplitted[i];
            String val = exprSplitted[i + 1];
            String unitate = exprSplitted[i + 2];
            Integer valoare = Integer.parseInt(semn + val);
            calcul += toMillimeters(valoare, unitate);
            minUnit = updateMinUnit(unitate, minUnit);
        }
        return "" + getValueInMinUnit(calcul, minUnit) + unitsString.get(minUnit);
    }

    private static int toMillimeters(int value, String unit) {
        switch (unit) {
            case "cm":
                return value * 10;
            case "dm":
                return value * 100;
            case "m":
                return value * 1000;
            case "km":
                return value * 1000 * 1000;
            default:
                return value;
        }
    }

    private static int updateMinUnit(String unit, int minUnit){
        return Math.min(unitsOrder.get(unit), minUnit);
    }

    private static int getValueInMinUnit(int value, int minUnit){
        return value / units.get(minUnit);
    }

}
