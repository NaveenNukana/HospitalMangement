package com.web.demo.EmailValidation.service;

import java.util.List;


import com.web.demo.EmailValidation.model.Patient;


public interface PatientService {
	Patient createPatient(Patient patient);
	
	List<Patient> getAllPatient();

}
