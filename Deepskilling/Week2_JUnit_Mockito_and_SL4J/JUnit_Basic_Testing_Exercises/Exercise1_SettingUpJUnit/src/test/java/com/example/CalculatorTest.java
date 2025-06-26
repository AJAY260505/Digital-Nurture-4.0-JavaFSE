package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int x = 4;
        int y = 5;
        int result = x * y;
        assertEquals(20, result);
    }
}
// This is a simple JUnit test class for testing basic arithmetic operations.
// It includes two test methods: one for addition and one for multiplication.
