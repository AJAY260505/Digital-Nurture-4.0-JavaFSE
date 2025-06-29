package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchFirstData() {
        return api.getData();
    }

    public String fetchSecondData() {
        return api.getData();
    }
}
