package com.web.demo.EmailValidation.util;

import java.util.Collections;

import com.web.demo.EmailValidation.doctorEnum.ApiStatus;
import com.web.demo.EmailValidation.model.ResponseEx;

public class ResponseUtil {
	public static ResponseEx getSuccessResponse(Object data) {
		ResponseEx response = new ResponseEx();
		response.setMessage("Data fetched successfully");
		response.setStatusCode(ApiStatus.SUCCESS.getvalue());
		response.setData(Collections.singleton(data));
		return response;
	}
	public static ResponseEx getCreateResponse(Object data) {
		ResponseEx response = new ResponseEx();
		response.setMessage("Data create successfully");
		response.setStatusCode(ApiStatus.CREATESUCCESSFULLY.getvalue());
		response.setData(Collections.singleton(data));
		return response;
	}
	public static ResponseEx getFailureResponse(String message) {
		ResponseEx response = new ResponseEx();
		response.setMessage(message);
		response.setStatusCode(ApiStatus.FAILURE.getvalue());
		return response;
	}
//	public static ResponseDto getResponse(String message,String status,Collection data) {
//		ResponseDto response = new ResponseDto();
//		response.setMessage(message);
//		response.setStatusCode(status);
//		response.setData(data);
//		return response;		
//	}
//	public static ResponseDto getResponse(String message,String status,Object data) {
//		ResponseDto response = new ResponseDto();
//		response.setMessage(message);
//		response.setStatusCode(status);
//		response.setData(Collections.singleton(data));
//		return response;		
//	}


}


