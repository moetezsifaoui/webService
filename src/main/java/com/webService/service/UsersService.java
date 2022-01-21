package com.webService.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.fasterxml.uuid.Generators;

import com.webService.entity.Users;
import com.webService.repository.UsersRepository;

@Service
public class UsersService implements IUsersService {

	@Autowired
	UsersRepository ur;
	
	@Override
	public void addUser(Users user) {
		String pw_hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(pw_hash);
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		user.setDateCreated(date);
		String token = "token-" + Generators.nameBasedGenerator().generate(user.getUsername());
		user.setToken(token);
		ur.save(user);
	}

	@Override
	public List<Users> getUsers() {
		return (List<Users>) ur.findAll();
	}

	@Override
	public void deleteUser(Users user) {
		ur.delete(user);
	}

	@Override
	public void updateUser(Users user) {
		String pw_hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(pw_hash);
		ur.save(user);
	}
	
	
	@Override
	public Users getUserById(int id) {
		return ur.findById(id).get();
	}

}
