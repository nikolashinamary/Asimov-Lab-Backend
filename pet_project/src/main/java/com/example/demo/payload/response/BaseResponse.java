package com.example.demo.payload.response;

public class BaseResponse {

    private Integer code;
    private final String message;

    public BaseResponse(String message, Integer code){
        this.message = message;
        this.code = code;
    }

    public String getMessage(){
        return this.message;
    }

    public Integer getCode(){
        return this.code;
    }

    public void setCode(int code){
        this.code = code;
    }
}
