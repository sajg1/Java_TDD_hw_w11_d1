import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(14.50, 11.50);
    }

    @Test
    public void hasNum1() {
        assertEquals(14.50, calculator.getNum1(), 0.01);
    }

    @Test
    public void hasNum2() {
        assertEquals(11.50, calculator.getNum2(), 0.01);
    }

    @Test
    public void changeNum1() {
        this.calculator.setNum1(15.50);
        assertEquals(15.50, calculator.getNum1(), 0.01);
    }

    @Test
    public void changeNum2() {
        this.calculator.setNum2(10.50);
        assertEquals(10.50, calculator.getNum2(), 0.01);
    }

    @Test
    public void addNumbers() {
        assertEquals(26.00, calculator.add(), 0.01);
    }

    @Test
    public void subtractNumbers() {
        assertEquals(3.00, calculator.subtract(), 0.01);
    }

    @Test
    public void multiplyNumbers() {
        assertEquals(166.75, calculator.multiply(), 0.01);
    }

    @Test
    public void divideNumbers() {
        assertEquals(1.26, calculator.divide(), 0.01);
    }

}
