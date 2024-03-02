package ru.vitaliyefimov.skblab.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class InitializationViaSetter {
    private Dependency dependency;

    @PostConstruct
    private void init() {
        log.info("Class %s was initialized. Dependency is %s"
                .formatted(this.getClass().getName(), dependency));
    }

    @PreDestroy
    private void preDestroy() {
        log.info("Class %s was invoked pre-destroy method".formatted(this.getClass().getName()));
    }

    @Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
