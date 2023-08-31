package com.atiper.atiperatask.model.exception;

public class RestClientException extends RuntimeException{
    private final String status;

    public RestClientException(String status, String message){
        super(message);
        this.status = status;
    }
}
