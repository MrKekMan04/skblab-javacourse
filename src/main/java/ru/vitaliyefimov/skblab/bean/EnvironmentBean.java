package ru.vitaliyefimov.skblab.bean;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class EnvironmentBean {
    @PostConstruct
    public void init() {
        log.info("A bin that depends on the environment variable has been created");
    }
}
