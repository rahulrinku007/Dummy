package com.cg.eis.bean;

//import com.cg.eis.pl.*;
import com.cg.eis.service.EmployeeService;
public class Employee {
	int id;
	String name;
	float salary;
	String designation,insuranceScheme;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getDesignation()=" + getDesignation() + ", getInsuranceScheme()=" + getInsuranceScheme() + "]";
	}
	
	
	
	

}
