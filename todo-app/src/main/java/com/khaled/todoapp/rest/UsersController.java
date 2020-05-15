package com.khaled.todoapp.rest;

import com.khaled.todoapp.entity.Users;
import com.khaled.todoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> GetUsers(){

        return userService.findAllUsers();
    }


}
