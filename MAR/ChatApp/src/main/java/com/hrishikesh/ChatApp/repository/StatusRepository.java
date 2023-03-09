package com.hrishikesh.ChatApp.repository;

import com.hrishikesh.ChatApp.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
