package com.web.demo.EmailValidation.hospitalRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.EmailValidation.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>  {

	Patient findByUsername(String username);

}
