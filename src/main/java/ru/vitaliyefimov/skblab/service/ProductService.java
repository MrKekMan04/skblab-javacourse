package ru.vitaliyefimov.skblab.service;

import ru.vitaliyefimov.skblab.entity.dto.ProductRequest;
import ru.vitaliyefimov.skblab.entity.dto.ProductResponse;

public interface ProductService {
    ProductResponse addId(ProductRequest request);
}
