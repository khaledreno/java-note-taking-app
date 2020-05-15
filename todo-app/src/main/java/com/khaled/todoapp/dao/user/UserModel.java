package com.khaled.todoapp.dao.user;

import com.khaled.todoapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModel extends JpaRepository <Users, Integer> {

}
