package com.cg.employee2.service;

import java.util.ArrayList;

import com.cg.employee2.dto.EmployeeDetails;
import com.cg.employee2.staticdb.EmployeeData;

public class EmpService {
EmployeeData employeeData=new EmployeeData();
public ArrayList<EmployeeDetails>getEmployeeDetails(){
	return employeeData.getEmpDetails1();
}
public EmployeeDetails getUniqueDetails(int empId) {
	for(EmployeeDetails edm:employeeData.getEmpDetails1())
	if(empId==edm.getEmpId()) {
		return edm;
		}
	return null;
		}
public void addEmployee(EmployeeDetails emp2) {
	// TODO Auto-generated method stub
	 employeeData.addEmployee(emp2);
}
	
}

