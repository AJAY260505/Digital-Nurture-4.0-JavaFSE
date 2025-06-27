package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchDataByKey(String key) {
        return api.getData(key);
    }
}
