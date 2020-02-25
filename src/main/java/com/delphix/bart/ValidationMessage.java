package com.delphix.bart;

public class ValidationMessage {
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ValidationMessage{" +
                "error=" + error +
                '}';
    }
}
