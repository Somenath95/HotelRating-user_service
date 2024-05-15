package com.project.hotel.user.userService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hotel.user.userService.entities.User;

public interface UserRepositories extends JpaRepository<User, String> {

}
