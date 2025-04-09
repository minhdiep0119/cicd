import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(cal.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(cal.subtract(5, 2), 3);
    }
}
