package com.delphix.bart;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class ValidationError {

    private ValidationMessage message;

    public ValidationMessage getMessage() {
        return message;
    }

    public void setMessage(ValidationMessage message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationError{" +
                "message=" + message +
                '}';
    }
}
