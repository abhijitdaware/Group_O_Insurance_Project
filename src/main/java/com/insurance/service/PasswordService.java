package com.insurance.service;

import com.insurance.model.Password;

public interface PasswordService {
	
	public Password getPassword(int id);

	public Password changePassword(int id);
}