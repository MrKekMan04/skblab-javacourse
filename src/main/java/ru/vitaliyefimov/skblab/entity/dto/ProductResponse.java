package ru.vitaliyefimov.skblab.entity.dto;

import java.util.Date;

public record ProductResponse(
        Double price,
        ProductInfo info
) {
    public record ProductInfo(Long id, Date date) {
    }
}
