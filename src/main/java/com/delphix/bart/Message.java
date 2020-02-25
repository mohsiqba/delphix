package com.delphix.bart;

public class Message {
    private String warning;
    private String error;

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Message{" +
                "warning='" + warning + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
