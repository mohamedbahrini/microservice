package com.tutorial.userservice.controller;

import com.tutorial.userservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    public List<User> findUsers() {
        return new ArrayList<>(Collections.singleton(new User("mohamed", "bahrini")));
    }
}
