package com.web.demo.EmailValidation.model;

import java.util.Collection;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ResponseEx<T> {
	private String message;
	private String statusCode;
	private Collection<T> data;

	
}



