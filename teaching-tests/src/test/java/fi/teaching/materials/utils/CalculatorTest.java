package fi.teaching.materials.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example JUnit test
 *
 * @author Kamil Janowski
 */
public class CalculatorTest {

    private Calculator calculator;

    /**
     * Is executed before every @Test
     */
    @Before
    public void init() {
        calculator = new Calculator();
    }

    /**
     * The test should go through, because 3 + 5 in fact equals 5
     */
    @Test
    public void testSum() {
        int a = 3;
        int b = 5;
        int sum = calculator.sum(a, b);

        Assert.assertEquals(8, sum);
    }

    /**
     * The test should fail, because calculator.multiply currently contains a bug!
     */
    @Test
    public void testMultiply() {
        int a = 3;
        int b = 5;
        int sum = calculator.multiply(a, b);

        Assert.assertEquals(15, sum);
    }
}