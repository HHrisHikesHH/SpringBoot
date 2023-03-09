package com.hrishikesh.ChatApp.service;

import com.hrishikesh.ChatApp.model.Users;
import com.hrishikesh.ChatApp.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersRepository repository;
    public Users saveUser(Users users) {
        return repository.save(users);
    }
}
