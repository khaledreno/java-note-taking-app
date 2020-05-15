package com.khaled.todoapp.dao.user;

import com.khaled.todoapp.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminModel extends JpaRepository <Admin, Integer> {

}
