package com.webService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webService.entity.Users;

@Service
public interface IUsersService {
	void addUser(Users user);
	List<Users> getUsers();
	void deleteUser(Users user);
	void updateUser(Users user);
	Users getUserById(int id);
}
