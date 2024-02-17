package com.roshan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.entity.Student;
import com.roshan.exception.StudentNotFoundException;
import com.roshan.repo.IStudentRepo;

@Service("studentService")
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	
	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public String registerStudent(Student student) {
		int id=studentRepo.save(student).getId();
		return "Student is  register having id value "+id;
	}

	@Override
	public List<Student> fetchAllStudent() {
		List<Student>  studentList=studentRepo.findAll();
		
	//	studentList.sort((s1,s2)->s1.getId().compareTo(s2.getId()));
	//  studentList.sort((s1,s2)->s1.getId().compareTo(s2.getId()));
	//   studentList.sort((s1,s2)->s1.getId().compareTo(s2.getId()));
	   
		System.out.println(" list of student are ::");
		return studentList;
	}

	@Override
	public Student fetchStudentByID(Integer id) throws StudentNotFoundException {
		
		return studentRepo.findById(id).
				    orElseThrow(()->new StudentNotFoundException(id+"student id not found "));
	}

	@Override
	public String updateStudentDetials(Student student) throws StudentNotFoundException {

		Optional<Student> optional = studentRepo.findById(student.getId());

		if (optional.isPresent()) {

			studentRepo.save(student);

			return student.getId() + "  student is updated ";
		} else {
			throw new StudentNotFoundException(student.getId() + " student is not found ");

		}

	}

	@Override
	public String deleteStudent(Integer id) throws StudentNotFoundException {

		Optional<Student> optional = studentRepo.findById(id);

		if (optional.isPresent()) {

			studentRepo.delete(optional.get());
			return id + " student is deleted";
		} else {
			throw new StudentNotFoundException(id + " student is not found ");
		}

	}

}
