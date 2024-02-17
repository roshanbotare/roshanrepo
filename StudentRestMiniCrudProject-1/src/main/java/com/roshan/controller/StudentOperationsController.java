package com.roshan.controller;

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

import com.roshan.entity.Student;
import com.roshan.service.IStudentMgmtService;

@RestController
@RequestMapping("/student")
public class StudentOperationsController {

	@Autowired
	private IStudentMgmtService service;
	
	
	@PostMapping("/hello")
	public ResponseEntity<String>  hello()
	{
		
		return new ResponseEntity<String>("hello roshan",HttpStatus.OK );
	}
	
	@PostMapping("/registerStudent")
	public ResponseEntity<String> registerStudent(@RequestBody Student student) {

		try {
			// use service
			String resultMsg = service.registerStudent(student);
			return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(" problem is register student", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayStudent() {
		try {

			List<Student> list = service.fetchAllStudent();
			return new ResponseEntity<List<Student>>(list, HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>("problem is fething student", HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	

	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayStudentById(@PathVariable Integer id) {

		try {
			Student student = service.fetchStudentByID(id);
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> modifyStudent(@RequestBody Student student) {
		try {
			String msg = service.updateStudentDetials(student);

			return new ResponseEntity<String>(msg, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeStudent(@PathVariable("id") Integer id) {
		try {

			String msg = service.deleteStudent(id);

			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
