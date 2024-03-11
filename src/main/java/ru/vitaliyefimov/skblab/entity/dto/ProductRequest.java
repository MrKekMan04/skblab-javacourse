package ru.vitaliyefimov.skblab.entity.dto;

import java.util.Date;

public record ProductRequest(
        Double price,
        ProductInfo info
) {
    public record ProductInfo(Date date) {
    }
}
