package com.vijay.userapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vijay.userapi.dtos.DepartmentDto;
import com.vijay.userapi.dtos.User_with_DepartmentDto;
import com.vijay.userapi.entity.UserEntity;
import com.vijay.userapi.repo.User_Repository;

@Service
public class User_Service {
	@Autowired
	private User_Repository user_Repository;

	@Autowired
	private RestTemplate restTemplete;

	public UserEntity saveUser(UserEntity userEntity) {

		return user_Repository.save(userEntity);
	}

	public List<UserEntity> getAllUsedetails() {

		return user_Repository.findAll();
	}

	public User_with_DepartmentDto getUserById(int user_Id) {

		UserEntity user = user_Repository.findById(user_Id).get();
		
		DepartmentDto departmentDto = restTemplete.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getDepartment_Id(),	DepartmentDto.class);

		User_with_DepartmentDto userWithDeoartment = new User_with_DepartmentDto( user,departmentDto);
		return userWithDeoartment;

	}

}
