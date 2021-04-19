package com.vijay.depApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.depApp.entity.Department;
import com.vijay.depApp.service.Department_Service;

@RestController
@RequestMapping("/department")
public class Department_Controller {

	@Autowired
	private Department_Service department_Service;

	@PostMapping("/saveDep")
	public Department saveDepartment(@RequestBody Department department) {
		return department_Service.saveDepartment(department);
	}

	@GetMapping("/getAllDep")
	public List<Department> getAllDepartments() {

		return department_Service.getAllDepartments();
	}

	@GetMapping("/{id}")
	public Department getDepartmentId(@PathVariable("id") Integer department_Id){
		return department_Service.getDepartmentId(department_Id);
	}

}
