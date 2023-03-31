package com.web.demo.EmailValidation.serviceImpl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.web.demo.EmailValidation.hospitalRepository.PatientRepository;
import com.web.demo.EmailValidation.model.Patient;
//@Service
//public class CustomHospitalDetailService implements UserDetailsService  {
//   @Autowired
//	private PatientRepository patientRepository;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Patient patient=patientRepository.findByUsername(username);
//		return new org.springframework.security.core.userdetails.User(patient.getUsername(), patient.getPassword(),
//				
//				patient.getRolename().stream().map(rolename -> new SimpleGrantedAuthority(rolename)).collect(Collectors.toList()));	}
//
//}
