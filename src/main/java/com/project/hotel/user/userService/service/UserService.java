package com.project.hotel.user.userService.service;

import java.util.List;

import com.project.hotel.user.userService.entities.User;

public interface UserService {

	//create
	User saveUser(User user);
	
	//get all
	List<User> getAllUser();
	
	//user by id
	User getUserById(String userId);
	
	//update
	User updateUser(User user);
	
	//delete by id
	void deleteUser(String userId);
}
