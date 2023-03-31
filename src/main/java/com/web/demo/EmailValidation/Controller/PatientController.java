package com.web.demo.EmailValidation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.EmailValidation.model.Patient;
import com.web.demo.EmailValidation.model.ResponseEx;
import com.web.demo.EmailValidation.service.PatientService;
import com.web.demo.EmailValidation.util.ResponseUtil;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;

	@PostMapping("/add")
	public HttpEntity<ResponseEx>  save(@RequestBody Patient patient) {
		patient = patientService.createPatient(patient);
		return  new ResponseEntity<>(ResponseUtil.getCreateResponse(patient), HttpStatus.ACCEPTED);

	}

	@GetMapping("/get")
	public HttpEntity<ResponseEx> findAll() {

		List<Patient> patient= patientService.getAllPatient();
		return new ResponseEntity<>(ResponseUtil.getSuccessResponse(patient), HttpStatus.CREATED);
	}
//	HttpEntity<Patient> findAll() {
//		List<Patient> Patient = patientService.getAllPatient();
//		return new ResponseEntity<>(ResponseUtil.getSuccessResponse(patients),HttpStatus.CREATED);
////		return new ResponseEntity<>(ResponseUtil.getSuccessResponse(patients),HttpStatus.CREATED);
//	}
}
