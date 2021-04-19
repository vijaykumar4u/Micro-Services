package com.vijay.userapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vijay.userapi.dtos.User_with_DepartmentDto;
import com.vijay.userapi.entity.UserEntity;
import com.vijay.userapi.service.User_Service;

@RestController
@RequestMapping("/user")
public class User_Controller {
	@Autowired
	private User_Service user_Service;

	@PostMapping("/saveUser")
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		return user_Service.saveUser(userEntity);
	}

	@GetMapping("/getAllUsedetails")
	public List<UserEntity> getAllUsedetails() {
		return user_Service.getAllUsedetails();
	}

	@GetMapping("/{id}")
	public User_with_DepartmentDto getUserById(@PathVariable("id") Integer user_Id) {

		return user_Service.getUserById(user_Id);

	}

}
