package ru.vitaliyefimov.skblab.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vitaliyefimov.skblab.exception.CustomException;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomException> customException(CustomException exception) {
        return ResponseEntity.status(exception.getStatusCode())
                .body(exception);
    }
}
