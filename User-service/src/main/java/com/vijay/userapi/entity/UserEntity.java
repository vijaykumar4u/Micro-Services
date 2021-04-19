package com.vijay.userapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	@Id
	private int user_Id;
	private String user_Name;
	private String user_Address;
	private String department_Id;

}
