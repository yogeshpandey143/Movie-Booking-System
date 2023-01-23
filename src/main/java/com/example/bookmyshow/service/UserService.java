package com.example.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bookmyshow.dto.UserResponseDto;
import com.example.bookmyshow.model.UserEntity;

public class UserService {
	
	
	@Autowired
	UserResponseDto userResponseDto;
	
	
	public String createUser(UserResponseDto userResponseDto) {
		
		
		// converted  the userRequestDtointo userEntity
		
		UserEntity userEntity= UserEntity.builder().name()
		
	}

}
