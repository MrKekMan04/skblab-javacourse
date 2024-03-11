package ru.vitaliyefimov.skblab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitaliyefimov.skblab.entity.dto.ProductRequest;
import ru.vitaliyefimov.skblab.entity.dto.ProductResponse;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public ProductResponse getProduct(@RequestBody ProductRequest request) {
        return new ProductResponse(request.price(), new ProductResponse.ProductInfo(123L, request.info().date()));
    }
}
