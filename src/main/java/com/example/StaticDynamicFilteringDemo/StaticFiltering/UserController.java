package com.example.StaticDynamicFilteringDemo.StaticFiltering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserService service;
    @GetMapping("/filtering")
    public List<User> getAllUser()
    {
        return service.findAll();
    }
}
