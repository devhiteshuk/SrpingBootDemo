// src/main/java/com/example/demo/controller/UserController.java
package com.dhl.spring.SpringBootDemo.controller;

import com.dhl.spring.SpringBootDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public String greetUser(@PathVariable String username) {
        return userService.greetUser(username);
    }
}
