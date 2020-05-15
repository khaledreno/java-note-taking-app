package com.khaled.todoapp.rest;

import com.khaled.todoapp.entity.Admin;
import com.khaled.todoapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService todoService) {
        this.adminService = todoService;
    }


    @GetMapping("/admins")
    public List<Admin> GetAdmins(){

        return adminService.findAllAdmins();
    }
}
