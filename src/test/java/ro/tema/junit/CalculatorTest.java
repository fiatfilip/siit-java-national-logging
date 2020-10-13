package ro.tema.junit;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test(){
        String result = Calculator.calculate("10 cm + 1 m - 10 mm");
        Assert.assertEquals("1090mm", result);

        String result2 = Calculator.calculate("- 10 cm + 1 m - 10 dm");
        Assert.assertEquals("-10cm", result2);
    }
}
