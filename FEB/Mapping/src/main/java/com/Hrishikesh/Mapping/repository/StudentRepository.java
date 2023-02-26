package com.Hrishikesh.Mapping.repository;

import com.Hrishikesh.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
