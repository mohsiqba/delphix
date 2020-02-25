package com.delphix.bart;

/**
 * Fetches Error details of an API response
 * <?xml version="1.0" encoding="utf-8"?>
 * <root>
 *     <message>
 *         <error>
 *             <text>Invalid orig</text>
 *             <details>The orig station parameter  is missing or invalid.</details>
 *         </error>
 *     </message>
 * </root>
 */
public class Error {
    private String text;
    private String details;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Error{" +
                "text='" + text + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
