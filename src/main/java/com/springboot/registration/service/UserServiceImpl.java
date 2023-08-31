package com.springboot.registration.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.springboot.registration.model.User;
import com.springboot.registration.repository.UserRepository;
import com.springboot.registration.web.dto.UserRegistrationDto;

import lombok.Data;

@Service
@Data
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(),registrationDto.getLastName,
							 registrationDto.getEmail(),registrationDto.getPassword(),Arrays.asList(new Role("ROLL_USER")));
		
		return userRepository.save();
		System.out.println();
	}
	
	
	
	

}
