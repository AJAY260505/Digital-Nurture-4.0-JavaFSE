package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testExceptionIsThrown() {
        ExceptionThrower et = new ExceptionThrower();

        // Assert that the method throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            et.throwException(true);
        });
    }

    @Test
    void testNoExceptionWhenFalse() {
        ExceptionThrower et = new ExceptionThrower();

        // No exception should be thrown here
        assertDoesNotThrow(() -> {
            et.throwException(false);
        });
    }
}
