package ru.vitaliyefimov.skblab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitaliyefimov.skblab.entity.dto.ProductRequest;
import ru.vitaliyefimov.skblab.entity.dto.ProductResponse;
import ru.vitaliyefimov.skblab.service.ProductService;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductResponse getProduct(@RequestBody ProductRequest request) {
        return productService.addId(request);
    }
}
