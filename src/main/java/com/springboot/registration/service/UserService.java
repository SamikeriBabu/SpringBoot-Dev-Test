package com.springboot.registration.service;

import com.springboot.registration.model.User;
import com.springboot.registration.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);

}
