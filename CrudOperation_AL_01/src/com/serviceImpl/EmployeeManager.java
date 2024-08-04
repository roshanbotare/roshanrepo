package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Department;
import com.pojo.Employee;
import com.service.DepartmentCRUD;
import com.service.EmployeeCRUD;

public class EmployeeManager implements EmployeeCRUD {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                return;
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
}


