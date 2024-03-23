package ru.vitaliyefimov.skblab.service;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import ru.vitaliyefimov.skblab.entity.dto.RegisterUserRequest;
import ru.vitaliyefimov.skblab.entity.dto.UserResponse;

@Validated
public interface UserService {
    UserResponse register(@Valid RegisterUserRequest request);
}
