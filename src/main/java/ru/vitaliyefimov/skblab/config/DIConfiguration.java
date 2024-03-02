package ru.vitaliyefimov.skblab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vitaliyefimov.skblab.entity.Dependency;
import ru.vitaliyefimov.skblab.entity.InitializationViaConstructor;
import ru.vitaliyefimov.skblab.entity.InitializationViaFieldInjection;
import ru.vitaliyefimov.skblab.entity.InitializationViaSetter;

@Configuration
public class DIConfiguration {
    @Bean
    public InitializationViaConstructor initializationViaConstructor(Dependency dependency) {
        return new InitializationViaConstructor(dependency);
    }

    @Bean
    public InitializationViaFieldInjection initializationViaFieldInjection() {
        return new InitializationViaFieldInjection();
    }

    @Bean
    public InitializationViaSetter initializationViaSetter() {
        return new InitializationViaSetter();
    }
}
