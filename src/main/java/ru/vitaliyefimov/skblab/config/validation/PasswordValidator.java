package ru.vitaliyefimov.skblab.config.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^.*(?=.{8,})(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!#$%&? \"]).*$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && PASSWORD_PATTERN.matcher(value).matches();
    }
}
