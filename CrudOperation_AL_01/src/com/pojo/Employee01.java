package com.pojo;

public class Employee01 {

	private int id;
	private String name;
	private int departmentId;

	public Employee01(int id, String name, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee01 [id=" + id + ", name=" + name + ", departmentId=" + departmentId + "]";
	}

}
