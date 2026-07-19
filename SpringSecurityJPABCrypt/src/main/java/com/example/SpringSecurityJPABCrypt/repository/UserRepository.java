package com.example.SpringSecurityJPABCrypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSecurityJPABCrypt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{

    UserEntity findByUsername(String username);

}