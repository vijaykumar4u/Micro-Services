package com.vijay.depApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.depApp.entity.Department;
import com.vijay.depApp.repo.Department_Repo;

@Service
public class Department_Service {
	@Autowired
	private Department_Repo department_Repo;

	public Department saveDepartment(Department department) {

		return department_Repo.save(department);
	}

	public List<Department> getAllDepartments() {

		return department_Repo.findAll();
	}

	public Department getDepartmentId(Integer department_Id) {
		
		return department_Repo.findById(department_Id).get();
	}

	

}
