package com.dhl.spring.SpringBootDemo.services;

import com.dhl.spring.SpringBootDemo.repository.LocalUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private LocalUserRepository userRepository;

    public String greetUser(String username) {
        return userRepository.findByUserId(1)
                .map(user -> "Hello, " + user.getUsername() + "!")
                .orElse("User not found");
    }
}
