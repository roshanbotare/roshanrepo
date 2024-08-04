package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Department;
import com.service.DepartmentCRUD;

public class DepartmentManager implements DepartmentCRUD {
   
	
	private List<Department> departments = new ArrayList<>();

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public Department getDepartment(int id) {
        for (Department department : departments) {
            if (department.getId() == id) {
                return department;
            }
        }
        return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>(departments);
    }

    @Override
    public void updateDepartment(Department department) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId() == department.getId()) {
                departments.set(i, department);
                return;
            }
        }
    }

    @Override
    public void deleteDepartment(int id) {
        departments.removeIf(department -> department.getId() == id);
    }
}