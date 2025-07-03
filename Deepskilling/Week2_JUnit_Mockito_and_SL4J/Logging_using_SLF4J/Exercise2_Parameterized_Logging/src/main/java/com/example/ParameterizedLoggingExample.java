package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "Ajay";
        int userId = 101;

        logger.info("User '{}' with ID {} has logged in.", username, userId);
        logger.warn("User '{}' attempted restricted action.", username);
        logger.error("User '{}' with ID {} encountered a system error!", username, userId);
    }
}
