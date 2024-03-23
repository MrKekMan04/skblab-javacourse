package ru.vitaliyefimov.skblab.service;

import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.dto.RegisterUserRequest;
import ru.vitaliyefimov.skblab.entity.dto.UserResponse;

@Service
public class SimpleUserService implements UserService {
    @Override
    public UserResponse register(RegisterUserRequest request) {
        return new UserResponse(request.username(), request.zipcode());
    }
}
