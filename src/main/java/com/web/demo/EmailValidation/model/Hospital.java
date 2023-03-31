package com.web.demo.EmailValidation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.web.demo.EmailValidation.doctorEnum.DoctorRoles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private DoctorRoles doctors;
	private String hospitalName;
	@ManyToOne(optional = true)
	@JoinColumn(name = "patient_id")
	private Patient patient;

	private String naruse;
	private String staff;
	private String address;

}
