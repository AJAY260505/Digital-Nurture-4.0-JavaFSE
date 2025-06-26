package com.example;

public class ExceptionThrower {
    public void throwException(boolean shouldThrow) throws IllegalArgumentException {
        if (shouldThrow) {
            throw new IllegalArgumentException("Exception triggered!");
        }
    }
}
