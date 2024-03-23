package ru.vitaliyefimov.skblab.config.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "\\d*")
@Size(min = 6, max = 6)
@NotNull
public @interface RussianZipCode {
    String message() default "{validation.constraint.RussianZipCode.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
