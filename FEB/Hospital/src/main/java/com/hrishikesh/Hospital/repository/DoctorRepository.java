package com.hrishikesh.Hospital.repository;

import com.hrishikesh.Hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
