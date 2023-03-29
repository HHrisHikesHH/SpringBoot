package com.hrishikesh.ChatApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Time;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;
    @NotBlank(message = "Message cannot be empty")
    private String messageBody;
    @NotNull(message = "SenderID is mandatory")
    private Integer senderId;
    @NotNull(message = "receiverID is mandatory")
    private Integer receiverId;
    private Time time = new Time(System.currentTimeMillis());
}
