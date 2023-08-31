package com.atiper.atiperatask.model.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{
    private final String status;

    public NotFoundException(String status, String message){
        super(message);
        this.status = status;
    }
}
