package ru.vitaliyefimov.skblab.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.vitaliyefimov.skblab.bean.DependentBean;
import ru.vitaliyefimov.skblab.bean.EnvironmentBean;
import ru.vitaliyefimov.skblab.bean.TestBean;

@Configuration
public class BeanConfiguration {
    @Bean
    @Profile("test")
    public TestBean testBean() {
        return new TestBean();
    }

    @Bean
    @ConditionalOnBean(value = TestBean.class)
    public DependentBean dependentBean() {
        return new DependentBean();
    }

    @Bean
    @ConditionalOnExpression("'${app.env-var}' != 'default'")
    public EnvironmentBean environmentBean() {
        return new EnvironmentBean();
    }
}
