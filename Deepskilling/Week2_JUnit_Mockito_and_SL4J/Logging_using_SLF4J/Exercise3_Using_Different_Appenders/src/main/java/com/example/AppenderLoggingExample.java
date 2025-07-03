package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.debug("Debug message - visible in both console and file");
        logger.info("Info message - logged to both console and file");
        logger.warn("Warning message - check app.log too");
        logger.error("Error message - captured by both appenders");
    }
}
