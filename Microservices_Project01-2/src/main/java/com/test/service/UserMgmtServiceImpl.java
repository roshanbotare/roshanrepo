package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.exception.UserNotFoundException;
import com.test.entity.User;
import com.test.repo.UserRepository;

@Service("studentService")
public class UserMgmtServiceImpl implements IUserMgmtService   {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String registerUser(User user) {
		int id=userRepository.save(user).getId();
		return "Student is  register having id value "+id;
	}

	@Override
	public List<User> fetchAllUser() {
		List<User>  userList=userRepository.findAll();
		
		    userList.sort((s1,s2)->s1.getId().compareTo(s2.getId()));
		   
			System.out.println(" list of student are ::");
			return userList;
	}

	@Override
	public User fetchUserByID(Integer id) throws UserNotFoundException {
		return userRepository.findById(id).
			    orElseThrow(()->new UserNotFoundException(id+"user id not found "));

	}

	@Override
	public String updateUserDetials(User user) throws UserNotFoundException {
		Optional<User> optional = userRepository.findById(user.getId());

		if (optional.isPresent()) {

			userRepository.save(user);

			return user.getId() + "  user is updated ";
		} else {
			throw new UserNotFoundException(user.getId() + " user is not found ");

		}
	}

	@Override
	public String deleteUser(Integer id) throws UserNotFoundException {
		Optional<User> optional = userRepository.findById(id);

		if (optional.isPresent()) {

			userRepository.delete(optional.get());
			return id + " user is deleted";
		} else {
			throw new UserNotFoundException(id + " user is not found ");
		}
	}

	
	
}
