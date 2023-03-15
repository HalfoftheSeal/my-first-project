import classroom_01032023.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
@Test
    public void testSum() {
    Calculator casio = new Calculator();
    Assert.assertEquals(casio.sum(10, 50), 60);

    }
    public void testDivide() {
    Calculator casio = new Calculator();
    Assert.assertEquals(casio.divide(15, 3), 5);
    }

    public void testSubtract() {
    Calculator casio = new Calculator();
    Assert.assertEquals(casio.subtract(10, 2), 8);

    }

    public void testMultiply() {
    Calculator casio = new Calculator();
    Assert.assertEquals(casio.multiply(6, 4), 24);
    }
}
