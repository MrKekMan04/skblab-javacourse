package ru.vitaliyefimov.skblab.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomException extends ResponseStatusException {
    public CustomException() {
        super(HttpStatus.BAD_GATEWAY, "Something went wrong!");
    }
}
