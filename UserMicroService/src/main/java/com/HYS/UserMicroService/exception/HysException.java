package com.HYS.UserMicroService.exception;

public class HysException extends Exception{
    private static final long serialVersionUID = 1L;

    public HysException(String message){
        super(message);
    }
}
