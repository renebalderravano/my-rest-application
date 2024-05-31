package com.myapplication.repository;

import com.myapplication.model.User;
import com.myapplication.util.IBase;

public interface UserRepository extends IBase<User> {
	
	public User findByUserName(String userName, String password);

}
