package com.cg.employee2.staticdb;

import java.util.ArrayList;

import com.cg.employee2.dto.EmployeeDetails;
//import com.cg.employee2.dto.EmployeeDto;

public class EmployeeData {
private static ArrayList<EmployeeDetails>EmpArray=null;
static {
	EmpArray=new ArrayList<>();
}
public static ArrayList<EmployeeDetails> getEmpDetails1(){
	EmployeeDetails dto=new EmployeeDetails();
	dto.setEmpId(1001);
	dto.setEmpName("Rahul");
	dto.setEmpSalary(50000);
	dto.setEmpDesignation("A4");
	
	EmployeeDetails dto1=new EmployeeDetails();
	dto1.setEmpId(1002);
	dto1.setEmpName("Sandeep");
	dto1.setEmpSalary(40000);
	dto1.setEmpDesignation("A3");
	
	EmployeeDetails dto2=new EmployeeDetails();
	dto2.setEmpId(1003);
	dto.setEmpName("Vinay");
	dto.setEmpSalary(30000);
	dto.setEmpDesignation("A2");
	
	EmpArray.add(dto);
	EmpArray.add(dto1);
	EmpArray.add(dto2);
	return EmpArray; 
	
	
	
}
public void addEmployee(EmployeeDetails emp2) {
	// TODO Auto-generated method stub
	EmpArray.add(emp2);
	System.out.println("Employee Added");
	
}


}
