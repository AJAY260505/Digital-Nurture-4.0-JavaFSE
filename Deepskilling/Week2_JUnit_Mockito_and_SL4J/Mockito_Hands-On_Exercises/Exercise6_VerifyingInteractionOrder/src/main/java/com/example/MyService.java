package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void executeSteps() {
        api.stepOne();
        api.stepTwo();
        api.stepThree();
    }
}
