package com.vijay.depApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.depApp.entity.Department;

@Repository
public interface Department_Repo extends JpaRepository<Department, Integer> {

	

	

}
