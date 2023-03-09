package com.hrishikesh.ChatApp.service;

import com.hrishikesh.ChatApp.model.Status;
import com.hrishikesh.ChatApp.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    StatusRepository repository;
    public Status saveStatus(Status status) {
        return repository.save(status);
    }
}
