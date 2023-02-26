package com.Hrishikesh.Mapping.repository;

import com.Hrishikesh.Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
