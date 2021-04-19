package com.vijay.userapi.dtos;

import com.vijay.userapi.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_with_DepartmentDto {

	
	private UserEntity userEntity;
	private DepartmentDto departmentDto;
}
