package com.healthcare_management.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.healthcare_management.demo.entity.Doctor;
import com.healthcare_management.demo.repository.DoctorRepository;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
    	return doctorRepository.save(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
    	return doctorRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorRepository.deleteById(id);
    }
    @GetMapping("/search")
    public List<Doctor> searchDoctor(
    @RequestParam String specialization){
    	

    return doctorRepository
    .findBySpecialization(specialization);
    }
    @PutMapping("/{id}")
    public Doctor updateDoctor(
    @PathVariable Long id,
    @RequestBody Doctor doctor){

    doctor.setId(id);

    return doctorRepository.save(doctor);
    }
}
