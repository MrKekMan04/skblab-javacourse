package ru.vitaliyefimov.skblab.entity;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class ClassWithFoo2 {
    private final Foo fooImpl2;

    @PostConstruct
    public void init() {
        log.info("Class %s contains %s".formatted(getClass().getName(), fooImpl2.getClass().getName()));
    }
}
