package com.hrishikesh.ChatApp.exceptionHandler;

public class MessageNotFoundException extends Exception {
    public MessageNotFoundException(String message) {
        super(message);
    }
}
