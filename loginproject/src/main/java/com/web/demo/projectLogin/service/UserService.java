package com.web.demo.projectLogin.service;

import com.web.demo.projectLogin.model.UserDtls;

public interface UserService {
	
	public UserDtls createUser(UserDtls user);
	
	public boolean checkEmail(String email);
}
