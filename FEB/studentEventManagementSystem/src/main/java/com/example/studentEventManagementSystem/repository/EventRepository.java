package com.example.studentEventManagementSystem.repository;

import com.example.studentEventManagementSystem.model.Event;
import com.example.studentEventManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
