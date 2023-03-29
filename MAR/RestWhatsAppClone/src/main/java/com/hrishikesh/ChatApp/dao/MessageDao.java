package com.hrishikesh.ChatApp.dao;

import com.hrishikesh.ChatApp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageDao extends JpaRepository<Message, Integer> {
    @Query(value = "select * from tbl_message t where t.sender_id = ?1 " +
            "and t.receiver_id = ?2 or t.sender_id = ?2 and t.receiver_id = ?1", nativeQuery = true)
    List<Message> getChatOf(Integer senderId, Integer receiverId);
}
