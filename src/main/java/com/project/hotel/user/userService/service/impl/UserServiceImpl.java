package com.project.hotel.user.userService.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hotel.user.userService.entities.User;
import com.project.hotel.user.userService.exceptions.ResourceNotFoundException;
import com.project.hotel.user.userService.repositories.UserRepositories;
import com.project.hotel.user.userService.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositories userRepositories;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomId = UUID.randomUUID().toString();
		user.setUserId(randomId);
		return userRepositories.save(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList = userRepositories.findAll();
		return userList;
	}

	@Override
	public User getUserById(String userId) {
		return userRepositories.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with the id not found!! " + userId));
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

}
