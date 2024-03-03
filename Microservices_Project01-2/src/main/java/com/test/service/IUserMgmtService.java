package com.test.service;

import java.util.List;

import com.roshan.exception.UserNotFoundException;
import com.test.entity.User;

public interface IUserMgmtService  {
	
public String registerUser(User user);
public List<User>  fetchAllUser();
public User  fetchUserByID(Integer id) throws UserNotFoundException;
public String   updateUserDetials(User student) throws UserNotFoundException;
public String    deleteUser(Integer id) throws UserNotFoundException;

}
	