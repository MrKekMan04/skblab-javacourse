package ru.vitaliyefimov.skblab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vitaliyefimov.skblab.entity.dto.RegisterUserRequest;
import ru.vitaliyefimov.skblab.entity.dto.UserResponse;
import ru.vitaliyefimov.skblab.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponse registerUser(@RequestBody RegisterUserRequest request) {
        return userService.register(request);
    }
}
