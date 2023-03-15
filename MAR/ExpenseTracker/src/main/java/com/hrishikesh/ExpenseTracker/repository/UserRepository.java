package com.hrishikesh.ExpenseTracker.repository;

import com.hrishikesh.ExpenseTracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUserName(String userName);
}
