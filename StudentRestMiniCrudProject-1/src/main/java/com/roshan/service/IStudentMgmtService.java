package com.roshan.service;

import java.util.List;

import com.roshan.exception.StudentNotFoundException;
import com.roshan.entity.Student;

public interface IStudentMgmtService {
	
public String registerStudent(Student student);
public List<Student>  fetchAllStudent();
public Student  fetchStudentByID(Integer id) throws StudentNotFoundException;
public String   updateStudentDetials(Student student) throws StudentNotFoundException;
public String    deleteStudent(Integer id) throws StudentNotFoundException;



}
