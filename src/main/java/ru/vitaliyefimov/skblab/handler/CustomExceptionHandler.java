package ru.vitaliyefimov.skblab.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vitaliyefimov.skblab.entity.dto.ApiErrorResponse;
import ru.vitaliyefimov.skblab.exception.CustomException;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiErrorResponse> customException(CustomException exception) {
        return ResponseEntity.status(exception.getStatusCode())
                .body(new ApiErrorResponse(exception.getStatusCode().value(), exception.getReason()));
    }
}
