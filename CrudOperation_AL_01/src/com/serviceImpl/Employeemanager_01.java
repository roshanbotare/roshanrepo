package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.pojo.Employee01;
import com.service.EmployeeCRUD_1;

public class Employeemanager_01 implements EmployeeCRUD_1 {

	private List<Employee01> emp= new ArrayList<>();
	
	
	@Override
	public void addEmployee(Employee01 employee01) {
		emp.add(employee01);

	}

	@Override
	public void updateEmployee(Employee01 employee01) {

		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getId() == employee01.getId()) {
				emp.set(i, employee01);
			}
		}
    }

	@Override
	public String getAllEmployee() {
		
		 StringBuilder sb = new StringBuilder();
	        sb.append("Employee details :: [");
	        
	        for (int i = 0; i < emp.size(); i++) {
	            sb.append(emp.get(i).toString());
	            if (i < emp.size() - 1) {
	                sb.append(", ");
	                
	            }
	        }
	        
	        sb.append("]");
	        return sb.toString();
	}

	@Override
	public Employee01 getEmployee01(int ind) {
		
		for (Employee01 employee01 : emp) {
			
			if (employee01.getId()==ind) {
				
				return employee01;
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		Optional<Employee01> empToDelete = emp.stream()
				.filter(employee -> employee.getId() == id)
				.findFirst();

		empToDelete.ifPresent(emp::remove);

		return empToDelete.isPresent();

	}

	@Override
	public void addEmployee(List<Employee01> list1) {
		
		emp.addAll(list1);
		
	}

	 @Override
	    public List<Employee01> searchByIdAndName(Map<Integer, List<String>> idAndName) {
	        List<Employee01> result = new ArrayList<>();

	        for (Employee01 employee : emp) {
	            boolean matches = true;

	            for (Map.Entry<Integer, List<String>> entry : idAndName.entrySet()) {
	                Integer id = entry.getKey();
	                List<String> names = entry.getValue();

	                if (employee.getId() == id && names.contains(employee.getName())) {
	                    result.add(employee);
	                    break; // Exit the inner loop if a match is found
	                }
	            }

	           
	        }

	        return result;
	    }
    
    
    
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
