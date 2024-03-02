package ru.vitaliyefimov.skblab.entity;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class ClassWithFoo1 {
    private final Foo fooImpl1;

    @PostConstruct
    public void init() {
        log.info("Class %s contains %s".formatted(getClass().getName(), fooImpl1.getClass().getName()));
    }
}
