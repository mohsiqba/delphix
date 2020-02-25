package com.delphix.bart;

public class RESTException extends RuntimeException {

    private String httpStatus;

    private Integer errorCode;

    private String errorMessage;

    public RESTException(String httpStatus, Integer errorCode, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = message;
    }
}
