package com.hrishikesh.Instagram.repository;

import com.hrishikesh.Instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
}
