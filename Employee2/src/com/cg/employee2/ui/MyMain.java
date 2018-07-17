package com.cg.employee2.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.employee2.dto.EmployeeDetails;
import com.cg.employee2.service.EmpService;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		EmpService service=new EmpService();
		
		System.out.println("Enter your choice: ");
		int choice=scanner.nextInt();
		if(choice==1) {
			ArrayList<EmployeeDetails>myList=new ArrayList<>();
			myList=service.getEmployeeDetails();
			for(EmployeeDetails e:myList) {
				System.out.println("Employee id is :"+e.getEmpId());
				System.out.println("Employee name is:"+e.getEmpName());
				System.out.println("Employee salary is:"+e.getEmpSalary());
				System.out.println("Employee designation is:"+e.getEmpDesignation());
				System.out.println("----------");
			}
			
		}else if(choice==2) {
			System.out.println("Enter employee id:");
			int eid=scanner.nextInt();
			EmployeeDetails ed=service.getUniqueDetails(eid);
			System.out.println("Employee id is :"+ed.getEmpId());
			System.out.println("Employee name is:"+ed.getEmpName());
			System.out.println("Employee salary is:"+ed.getEmpSalary());
			System.out.println("Employee designation is:"+ed.getEmpDesignation());
		}else if(choice==3) {
			System.out.println("Enter employee id: ");
			int empId=scanner.nextInt();
			System.out.println("Enter employee name: ");
			String empName=scanner.next();
			System.out.println("Enter employee salary: ");
			double empSalary=scanner.nextDouble();
			System.out.println("Enter employee designation: ");
			String empDesignation=scanner.next();
			
			System.out.println("Enter employee details");
			EmployeeDetails emp2=new EmployeeDetails();
			emp2.setEmpId(empId);
			emp2.setEmpName(empName);
			emp2.setEmpSalary(empSalary);
			emp2.setEmpDesignation(empDesignation);
			
			service.addEmployee(emp2);
			System.out.println("Added employee details: ");
			System.out.println("Employee id: "+emp2.getEmpId()+"Employee Name: "+emp2.getEmpName()+"Employee Salary: "+emp2.getEmpSalary()+"Employee Designation: "+emp2.getEmpDesignation());
			
		}
		
		
	}

}
