package com.example.model;

public class ProcessedItem {

    public ProcessedItem() {
    }

    public ProcessedItem(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
