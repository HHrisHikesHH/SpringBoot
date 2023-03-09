package com.hrishikesh.ChatApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_chat_history")
public class ChatHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer charId;
    @JoinColumn(name = "to_user_id")
    @ManyToOne
    private Users to;
    @JoinColumn(name = "from_user_id")
    @ManyToOne
    private Users from;
    @Column(name = "message")
    private String message;
//    @CreationTimestamp
    @Column(name = "created_date")
    private Timestamp createdDate;
//    @UpdateTimestamp
    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusId;
}
