package com.khaled.todoapp.service;

import com.khaled.todoapp.dao.user.AdminModel;
import com.khaled.todoapp.dao.user.UserModel;
import com.khaled.todoapp.entity.Admin;
import com.khaled.todoapp.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private AdminModel adminModel;


    @Autowired
    public AdminService(AdminModel adminModel) {
        this.adminModel = adminModel;
    }



    public List<Admin> findAllAdmins(){

        return adminModel.findAll();
    }


}
