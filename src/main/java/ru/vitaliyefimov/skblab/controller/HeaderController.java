package ru.vitaliyefimov.skblab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitaliyefimov.skblab.entity.dto.HeaderResponse;

import java.util.Map;

@RestController
@RequestMapping("/header")
public class HeaderController {
    @GetMapping
    public Iterable<HeaderResponse> getHeaders(@RequestHeader Map<String, String> headers) {
        return headers.entrySet().stream()
                .map(entry -> new HeaderResponse(entry.getKey(), entry.getValue()))
                .toList();
    }
}
