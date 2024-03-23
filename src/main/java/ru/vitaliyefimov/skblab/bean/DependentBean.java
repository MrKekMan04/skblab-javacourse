package ru.vitaliyefimov.skblab.bean;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DependentBean {
    @PostConstruct
    public void init() {
        log.info("The bin that depends on the creation of the first bin is created");
    }
}
