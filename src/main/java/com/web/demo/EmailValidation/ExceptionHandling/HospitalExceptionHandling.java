package com.web.demo.EmailValidation.ExceptionHandling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.web.demo.EmailValidation.Exception.ResourceNotFoundException;
import com.web.demo.EmailValidation.model.ResponseEx;
import com.web.demo.EmailValidation.util.ResponseUtil;

import lombok.extern.slf4j.Slf4j;
@ControllerAdvice
@Slf4j
public class HospitalExceptionHandling {
   
	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<ResponseEx> notFoundException(ResourceNotFoundException notFoundException){
		log.info("no resource found");
		return new ResponseEntity<>(ResponseUtil.getFailureResponse(notFoundException.getMessage()),notFoundException.getCode());
	}
}
