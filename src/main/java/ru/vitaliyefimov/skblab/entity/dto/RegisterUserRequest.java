package ru.vitaliyefimov.skblab.entity.dto;

import ru.vitaliyefimov.skblab.config.validation.Password;
import ru.vitaliyefimov.skblab.config.validation.RussianZipCode;

public record RegisterUserRequest(
        String username,
        @Password
        String password,
        @RussianZipCode
        String zipcode
) {
}
