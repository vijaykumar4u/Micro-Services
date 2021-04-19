package com.vijay.userapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.userapi.entity.UserEntity;

@Repository
public interface User_Repository extends JpaRepository<UserEntity, Integer> {

}
