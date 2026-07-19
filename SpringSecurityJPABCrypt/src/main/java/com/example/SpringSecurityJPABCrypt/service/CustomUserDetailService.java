package com.example.SpringSecurityJPABCrypt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityJPABCrypt.entity.UserEntity;
import com.example.SpringSecurityJPABCrypt.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        UserEntity user = repo.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles("USER")
                .build();
    }

}