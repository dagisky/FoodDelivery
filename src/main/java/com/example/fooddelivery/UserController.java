package com.example.fooddelivery;

import com.example.fooddelivery.Model.User;
import com.example.fooddelivery.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id){
        return userService.findById(id);
    }
}
