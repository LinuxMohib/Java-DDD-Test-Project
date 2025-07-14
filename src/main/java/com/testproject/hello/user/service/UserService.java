package com.testproject.hello.user.service;

import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.testproject.hello.user.entity.User;
import com.testproject.hello.user.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepo;
    private final PasswordEncoder encoder;


    public UserService(UserRepository userRepo, PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    public void register(String username, String rawPassword) {
        String hashed = encoder.encode(rawPassword);
        userRepo.save(new User(UUID.randomUUID().toString(), username, hashed, "ROLE"));
    }
}
