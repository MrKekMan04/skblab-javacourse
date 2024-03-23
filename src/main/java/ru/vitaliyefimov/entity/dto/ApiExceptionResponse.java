package ru.vitaliyefimov.entity.dto;

public record ApiExceptionResponse(
        Integer status,
        String cause
) {
}
