package com.lpu.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lpu.user.entity.User;
import com.lpu.user.service.UserService;


@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService service;
    
    
    @GetMapping("/save")
    public String save() {
    	//System.err.println("sdfghj");
    	return "hiiiiii!!!";
    	
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
        //return "USER CREATED";
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        service.deleteUser(id);
        return "User Deleted";
    }
}
