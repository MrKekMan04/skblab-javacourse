package ru.vitaliyefimov.skblab.entity.dto;

public record ApiErrorResponse(
        Integer status,
        String reason
) {
}
