package com.healthcare_management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.healthcare_management.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
