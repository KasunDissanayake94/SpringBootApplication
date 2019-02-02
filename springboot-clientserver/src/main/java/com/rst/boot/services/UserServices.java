package com.rst.boot.services;

import java.util.List;

import com.rst.boot.model.UserModel;

public interface UserServices {
	
	List<UserModel> getAllUsers();

	String saveUser(UserModel userdata);

	String updateUser(UserModel userdata);

}
