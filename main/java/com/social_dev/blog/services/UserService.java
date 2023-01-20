package com.social_dev.blog.services;

//import com.social_dev.blog.payloads.ApiResponse;
//import com.social_dev.blog.entities.User;
import com.social_dev.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

	UserDto registerNewUser(UserDto user);
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId); 
}
