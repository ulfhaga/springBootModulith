package com.example.moduleb.api;

public class ModuleBEvent {

    private final String message;

    public ModuleBEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

