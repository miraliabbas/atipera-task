package com.atiper.atiperatask.model.exception;

import lombok.Getter;

@Getter
public class NotAcceptableException extends RuntimeException{
    private final String status;

    public NotAcceptableException(String status, String message){
        super(message);
        this.status = status;
    }
}
