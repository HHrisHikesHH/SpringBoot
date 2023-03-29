package com.hrishikesh.ChatApp.dao;

import com.hrishikesh.ChatApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
