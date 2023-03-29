package com.hrishikesh.ChatApp.dao;

import com.hrishikesh.ChatApp.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatDao extends JpaRepository<Chat, Integer> {
}
