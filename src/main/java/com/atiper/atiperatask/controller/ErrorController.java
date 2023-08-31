package com.atiper.atiperatask.controller;

import com.atiper.atiperatask.model.exception.ErrorResponse;
import com.atiper.atiperatask.model.exception.NotAcceptableException;
import com.atiper.atiperatask.model.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleError(Exception ex){
        return new ErrorResponse("500","Unexpected error");
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handleError(NotFoundException ex){
        return new ErrorResponse("404",ex.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(NotAcceptableException.class)
    public ErrorResponse handleError(NotAcceptableException ex){
        return new ErrorResponse("406",ex.getMessage());
    }
}
