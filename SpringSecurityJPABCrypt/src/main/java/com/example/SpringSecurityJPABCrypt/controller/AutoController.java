package com.example.SpringSecurityJPABCrypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.SpringSecurityJPABCrypt.entity.UserEntity;
import com.example.SpringSecurityJPABCrypt.service.UserService;

@RestController
public class AutoController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@RequestBody UserEntity user) {

        return service.register(user);

    }

    @GetMapping("/")
    public String home() {

        return "Welcome";

    }

}