package com.web.demo.EmailValidation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.EmailValidation.hospitalRepository.PatientRepository;
import com.web.demo.EmailValidation.model.Patient;
import com.web.demo.EmailValidation.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository; 

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		patient=patientRepository.save(patient);
		return patient;
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		List<Patient> patient= patientRepository.findAll();
		return patient;
	}

}
