package com.example.resrfulapi;

public class ResponseData {
    private boolean status;
    private String message;

    // Getter và Setter
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
