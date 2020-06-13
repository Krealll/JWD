package com.krealll.task1.exception;

public class ParseException extends Exception {

    public ParseException(String message){
        super((message));
    }

    public ParseException(Throwable reason){
        super((reason));
    }

    public ParseException(String message, Throwable reason){
        super(message,reason);
    }
}
