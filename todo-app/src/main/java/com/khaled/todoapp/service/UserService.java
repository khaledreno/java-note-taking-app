package com.khaled.todoapp.service;

import com.khaled.todoapp.dao.user.UserModel;
import com.khaled.todoapp.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserModel userModel;

    @Autowired
    public UserService(UserModel userModel) {
        this.userModel = userModel;
    }


    public List<Users> findAllUsers(){

        return userModel.findAll();
    }




}
