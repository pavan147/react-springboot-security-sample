package net.javaguides.todo.service.impl;

import net.javaguides.todo.TodoManagementApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    PasswordEncoder passwordEncoder;


    @GetMapping("/test")
    public String test() {
        String rawPassword = "test"; // Replace with actual password
        String encryptedPassword = passwordEncoder.encode(rawPassword);
        System.out.println("----------------------------------------------------------------------------------------"+ encryptedPassword);

        return encryptedPassword;
    }
}