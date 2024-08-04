package com.service;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeCRUD  {
	
	    void addEmployee(Employee employee);
	    Employee getEmployee(int id);
	    List<Employee> getAllEmployees();
	    void updateEmployee(Employee employee);
	    void deleteEmployee(int id);
	}
	


