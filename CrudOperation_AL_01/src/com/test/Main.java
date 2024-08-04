package com.test;

import com.pojo.Department;
import com.pojo.Employee;
import com.service.DepartmentCRUD;
import com.service.EmployeeCRUD;
import com.serviceImpl.DepartmentManager;
import com.serviceImpl.EmployeeManager;

public class Main {
    public static void main(String[] args) {
        EmployeeCRUD employeeManager = new EmployeeManager();
        DepartmentCRUD departmentManager = new DepartmentManager();

        // Add departments
        departmentManager.addDepartment(new Department(1, "HR"));
        departmentManager.addDepartment(new Department(2, "IT"));

        // Add employees
        employeeManager.addEmployee(new Employee(1, "Alice", 1));
        employeeManager.addEmployee(new Employee(2, "Bob", 2));

        // Get and print all departments
        System.out.println("Departments: " + departmentManager.getAllDepartments());

        // Get and print all employees
        System.out.println("Employees: " + employeeManager.getAllEmployees());

        // Update an employee
        Employee employee = employeeManager.getEmployee(1);
        if (employee != null) {
            employee.setName("Alice Smith");
            employeeManager.updateEmployee(employee);
        }

        // Print updated employee
        System.out.println("Updated Employee: " + employeeManager.getEmployee(1));

        // Delete an employee
        employeeManager.deleteEmployee(2);

        // Print all employees after deletion
        System.out.println("Employees after deletion: " + employeeManager.getAllEmployees());
    }
}
