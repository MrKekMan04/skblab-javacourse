package ru.vitaliyefimov.skblab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitaliyefimov.skblab.exception.CustomException;

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @GetMapping
    public void getException() {
        throw new CustomException();
    }
}
