package com.example.schedulewithjpa.global.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotMatchPwException extends RuntimeException {
    public NotMatchPwException(String message) {
        super(message);
    }
}
