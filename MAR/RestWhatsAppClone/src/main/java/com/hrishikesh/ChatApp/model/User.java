package com.hrishikesh.ChatApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @NotBlank(message = "User Name is mandatory")
    private String userName;
    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;
    @NotNull(message = "phoneNumber is mandatory")
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;
    private Character gender;
    @ElementCollection(targetClass=DummyUser.class)
    private Set<DummyUser> myContacts;
}
