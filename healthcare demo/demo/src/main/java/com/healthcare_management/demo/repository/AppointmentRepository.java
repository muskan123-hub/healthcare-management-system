package com.healthcare_management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.healthcare_management.demo.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}