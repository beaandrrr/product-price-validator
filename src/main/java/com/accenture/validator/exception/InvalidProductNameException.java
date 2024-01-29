package com.accenture.validator.exception;

public class InvalidProductNameException extends RuntimeException {
    public InvalidProductNameException (String message) {
        super(message);
    }
}
