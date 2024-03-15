package com.example.demo.payload.response;

import java.util.List;

public class TestResponse {
    List<String> test;
    public TestResponse(List<String> test){
        this.test = test;
    }

    public TestResponse(){}

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }
}
