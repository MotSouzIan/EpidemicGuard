package com.example.EpidemicGuard.controllers;

import com.example.EpidemicGuard.entities.User;
import com.example.EpidemicGuard.interfaces.UserApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserApplication userApplication;

    @PostMapping
    public User create(@RequestBody User user){
        return userApplication.create(user);
    }
}
