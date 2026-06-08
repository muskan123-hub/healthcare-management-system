package com.healthcare_management.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare_management.demo.entity.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findBySpecialization(String specialization);

}