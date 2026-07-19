package com.example.SpringSecurityJPABCrypt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityJPABCrypt.entity.UserEntity;
import com.example.SpringSecurityJPABCrypt.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public String register(UserEntity user) {

        user.setPassword(encoder.encode(user.getPassword()));

        repo.save(user);

        return "User Registered Successfully";
    }

}