package com.example;

public class MyService {
    private LoggerService logger;

    public MyService(LoggerService logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Process executed");
    }
}
