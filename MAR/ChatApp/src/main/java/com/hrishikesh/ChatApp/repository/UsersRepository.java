package com.hrishikesh.ChatApp.repository;

import com.hrishikesh.ChatApp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
