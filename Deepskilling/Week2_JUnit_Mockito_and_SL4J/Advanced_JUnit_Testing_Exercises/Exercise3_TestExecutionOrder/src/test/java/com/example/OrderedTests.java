package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("Running testFirst");
        Assertions.assertTrue(true);
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("Running testThird");
        Assertions.assertTrue(true);
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("Running testSecond");
        Assertions.assertTrue(true);
    }
}
