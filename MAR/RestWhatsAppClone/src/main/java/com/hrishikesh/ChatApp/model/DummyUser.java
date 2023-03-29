package com.hrishikesh.ChatApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DummyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dummyUserId;
    private Integer userId;
    private String userName;

    public DummyUser(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
