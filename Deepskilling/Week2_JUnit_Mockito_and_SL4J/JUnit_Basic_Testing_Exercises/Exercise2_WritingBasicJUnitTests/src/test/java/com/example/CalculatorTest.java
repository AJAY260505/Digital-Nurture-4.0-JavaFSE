package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(9, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);
    }
}
