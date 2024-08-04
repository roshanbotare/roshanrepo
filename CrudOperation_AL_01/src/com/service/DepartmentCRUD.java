package com.service;

import java.util.List;

import com.pojo.Department;

public interface DepartmentCRUD {
	
	void addDepartment(Department department);
    Department getDepartment(int id);
    List<Department> getAllDepartments();
    void updateDepartment(Department department);
    void deleteDepartment(int id);

}
