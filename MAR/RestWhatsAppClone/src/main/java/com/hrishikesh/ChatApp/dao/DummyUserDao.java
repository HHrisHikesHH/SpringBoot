package com.hrishikesh.ChatApp.dao;

import com.hrishikesh.ChatApp.model.DummyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyUserDao extends JpaRepository<DummyUser, Integer> {
}
