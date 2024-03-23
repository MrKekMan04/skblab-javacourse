package ru.vitaliyefimov.skblab.bean;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestBean {
    @PostConstruct
    public void init() {
        log.info("The bin, which depends on the test profile, has been created");
    }
}
