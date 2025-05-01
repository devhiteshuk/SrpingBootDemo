package com.dhl.spring.SpringBootDemo.controller;

import com.dhl.spring.SpringBootDemo.entity.LocalUser;
import com.dhl.spring.SpringBootDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public LocalUser createUser(@RequestBody LocalUser user) {
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public Optional<LocalUser> getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<LocalUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public LocalUser updateUser(@PathVariable Integer id, @RequestBody LocalUser user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
    @GetMapping("/topusers")
    public List<LocalUser> getTop3UserBySalary(){
        return userService.getTop3UserBySalary();
    }
}
