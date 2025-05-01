package com.dhl.spring.SpringBootDemo;

import com.dhl.spring.SpringBootDemo.entity.LocalUser;
import com.dhl.spring.SpringBootDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class TestRunner  implements CommandLineRunner {
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        LocalUser newUser = new LocalUser(null, "testuser", "Test User", 30000);
        LocalUser saved = userService.addUser(newUser);
        System.out.println("Created user: " + saved);
    }
}
