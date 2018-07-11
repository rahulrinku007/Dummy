package com.cg.eis.pl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.*;

import com.cg.eis.bean.Employee;

import com.cg.eis.exception.SalaryException;
import com.cg.eis.service.EmployeeService;;

public class MyMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("Enter the salary");
		float salary =sc.nextFloat();
		emp.setId(id);
		emp.setName(name);
		try {
			if(salary<3000)
			{
				throw new SalaryException();
			}
			else
			{
				System.out.println("Enter designation");
				String designation = sc.nextLine();
				EmployeeService es=new EmployeeService();
				String insuranceScheme = es.findInsuranceScheme(salary, designation);
				emp.setId(id);
				emp.setName(name);
				emp.setDesignation(designation);
				emp.setSalary(salary);
				emp.setInsuranceScheme(insuranceScheme);
				System.out.println("emp");
			
			
			
			FileWriter fw=new FileWriter("output.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(emp.toString());
			
			FileReader fr;
			fr=new FileReader("output.txt");
			BufferedReader br=new BufferedReader(fr);
			
			int i=br.read()
;
			
		while(i!=1)
		{
			System.out.println((char)i);
			i=br.read();
		}
		br.close();
			}
		sc.close();
	}
		
	catch(SalaryException e)
	{
		System.out.println(e);
	}

}
}