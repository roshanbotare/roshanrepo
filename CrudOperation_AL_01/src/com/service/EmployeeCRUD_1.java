package com.service;

import java.util.List;
import java.util.Map;

import com.pojo.Employee01;

public interface EmployeeCRUD_1 {
	
	
	void addEmployee(Employee01 employee01);
	void addEmployee(List<Employee01> list1);
	
	void updateEmployee(Employee01 employee01);
	String  getAllEmployee();
	
	Employee01 getEmployee01(int ind);
	boolean deleteEmployee(int id);
	List<Employee01> searchByIdAndName(Map<Integer, List<String>> idAndName);
	
	

	
	

}
