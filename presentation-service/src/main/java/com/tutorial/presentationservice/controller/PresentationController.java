package com.tutorial.presentationservice.controller;

import com.tutorial.presentationservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/presentation")
public class PresentationController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public List<User> findAllUsers() {
        return Arrays.asList(restTemplate.getForObject("http://client-service/api/users/test/", User[].class));
    }

}
