package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pojo.Employee01;
import com.service.EmployeeCRUD_1;
import com.serviceImpl.Employeemanager_01;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeCRUD_1 employeeCRUD_1= new Employeemanager_01();
		
		
		List<Employee01>  list1= new ArrayList<>();
		
		list1.add( new Employee01(1, "rosahn_01", 1));
		list1.add(  new Employee01(2, "rosahn_02", 1));
		list1.add( new Employee01(3, "rosahn_03", 1));
		list1.add( new Employee01(4, "rosahn_04", 1));
		
		
		System.out.println(" list of employee ::");
		list1.forEach( emp ->
		System.out.println(" emp id   :: "+emp.getId()+
				           " emp name :: "+emp.getName()+
				           " emp dept :: "+emp.getDepartmentId()));
		
		
		//1.  add employee  using  object using 
		//    this signature ->  void addEmployee(Employee01 employee01);
		
		employeeCRUD_1.addEmployee( new Employee01(5, "rosahn_05", 2));
		employeeCRUD_1.addEmployee( new Employee01(6, "rosahn_06", 2));
		employeeCRUD_1.addEmployee( new Employee01(7, "rosahn_07", 2));
		employeeCRUD_1.addEmployee( new Employee01(8, "rosahn_08", 2));
		
		System.out.println();
		
		//1.  add employee using list using this signature 
		  //   ->  void addEmployee(List<Employee01> list1);
		
		employeeCRUD_1.addEmployee(list1);
		
		
		// 2. print all employee
		System.out.println(" employee details  ::"+employeeCRUD_1.getAllEmployee());
		
		System.out.println();
		
		
		
		// 3. find employee
		System.out.println(" find employee id 2 |  "+employeeCRUD_1.getEmployee01(2));
		
		
		// 4. update employee
		
		
		
		Employee01 employee01=	employeeCRUD_1.getEmployee01(1);
		
		System.out.println(); System.out.println(" Update employee one | :: " +employee01);
		
		
		if ( employee01 != null) {
			
			employee01.setDepartmentId(1);
			employee01.setId(66);
			employee01.setName("ROHAN");
			
			employeeCRUD_1.updateEmployee(employee01);
		}
		
		System.out.println();
		System.out.println(" after updated employeee :: "+employeeCRUD_1.getEmployee01(66));
		
		
		System.out.println("");
		System.out.println(" delete employeee  66 ");
		
		System.out.println(" delete employee ::"+employeeCRUD_1.deleteEmployee(66));
		
		System.out.println();
		
		System.out.println(" after  deleted employeee :: "+employeeCRUD_1.getEmployee01(66));
		
		
		
		System.out.println();
		System.out.println(" serch by using ID and Name ");
		
		
	        
		 // Searching for employees by ID and names
	        Map<Integer, List<String>> idAndName = new HashMap<>();
	        List<String> names1 = new ArrayList<>();
	        names1.add("rosahn_01");
	        idAndName.put(1, names1);

	        List<Employee01> foundEmployees = employeeCRUD_1.searchByIdAndName(idAndName);
	        System.out.println("Employees with specified ID and names: " + foundEmployees);
	        
	        // Example of searching multiple names for one ID
	        List<String> names2 = new ArrayList<>();
	        names2.add("rosahn_01");
	        names2.add("rosahn_05");
	        idAndName.put(5, names2);

	        List<Employee01> foundEmployees2 = employeeCRUD_1.searchByIdAndName(idAndName);
	        System.out.println("Employees with specified ID and names: " + foundEmployees2);
	   	
		
		
		

	}

}
