package ro.tema.junit;

public class Main {
    public static void main(String[] args) {
        String result = Calculator.calculate("10 cm + 1 m - 10 mm");
        System.out.println(result);

        String result2 = Calculator.calculate("- 10 cm + 1 m - 10 dm");
        System.out.println(result2);
    }
}
