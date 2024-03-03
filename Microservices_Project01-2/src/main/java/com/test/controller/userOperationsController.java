package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.service.IUserMgmtService;

@RestController
@RequestMapping("/user")
public class userOperationsController {

	@Autowired
	private IUserMgmtService service;
	
	
	@PostMapping("/hello")
	public ResponseEntity<String>  hello()
	{
		
		return new ResponseEntity<String>("hello roshan",HttpStatus.OK );
	}
	
	@PostMapping("/registerUser")
	public ResponseEntity<String> registerStudent(@RequestBody User user) {

		try {
			// use service
			String resultMsg = service.registerUser(user);
			return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(" problem is register user", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayStudent() {
		try {

			List<User> list = service.fetchAllUser();
			return new ResponseEntity<List<User>>(list, HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>("problem is fething user", HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	

	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayStudentById(@PathVariable Integer id) {

		try {
			User user = service.fetchUserByID(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> modifyStudent(@RequestBody User user) {
		try {
			String msg = service.updateUserDetials(user);

			return new ResponseEntity<String>(msg, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeStudent(@PathVariable("id") Integer id) {
		try {

			String msg = service.deleteUser(id);

			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
