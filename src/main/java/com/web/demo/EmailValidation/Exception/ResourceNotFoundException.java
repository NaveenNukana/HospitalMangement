package com.web.demo.EmailValidation.Exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class ResourceNotFoundException extends RuntimeException {
	
	private String message;
	private HttpStatus code;


}
