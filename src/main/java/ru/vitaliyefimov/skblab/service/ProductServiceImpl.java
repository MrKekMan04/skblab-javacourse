package ru.vitaliyefimov.skblab.service;

import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.dto.ProductRequest;
import ru.vitaliyefimov.skblab.entity.dto.ProductResponse;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Long SOME_ID = 123L;

    @Override
    public ProductResponse addId(ProductRequest request) {
        return new ProductResponse(request.price(), new ProductResponse.ProductInfo(SOME_ID, request.info().date()));
    }
}
