package com.bugcoder.hellowREST;

public class HellowResponseModel {
    private String message;

    public HellowResponseModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
