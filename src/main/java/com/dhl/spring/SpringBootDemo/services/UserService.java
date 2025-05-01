package com.dhl.spring.SpringBootDemo.services;

import com.dhl.spring.SpringBootDemo.entity.LocalUser;
import com.dhl.spring.SpringBootDemo.repository.LocalUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private LocalUserRepository userRepository;

    // Create or Add User
    public LocalUser addUser(LocalUser user) {
        return userRepository.save(user);
    }

    // Read/Get a User by ID
    public Optional<LocalUser> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    // Read/Get All Users
    public List<LocalUser> getAllUsers() {
        return userRepository.findAll();
    }

    // Update User
    public LocalUser updateUser(Integer id, LocalUser updatedUser) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setUsername(updatedUser.getUsername());
                    existingUser.setFullName(updatedUser.getFullName());
                    return userRepository.save(existingUser);
                }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    // Delete User
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    // Greeting (already provided)
    public String greetUser(String username) {
        return userRepository.findByUserId(1)
                .map(user -> "Hello, " + user.getUsername() + "!")
                .orElse("User not found");
    }

    //Get top 3 user by salary
    public List<LocalUser> getTop3UserBySalary() {
        return userRepository.findAll().stream().filter(e -> e.getSalary()>3000).collect(Collectors.toList());
    }
}
