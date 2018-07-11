package com.cg.eis.service;

public class EmployeeService implements IEmployeeService {

	@Override
	public String findInsuranceScheme(float salary, String designation) {
		// TODO Auto-generated method stub
		
		if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate"))
		{
			return "Scheme c";
		}
		else if((salary>=20000 && salary<40000 )&&  designation.equalsIgnoreCase("programmer" ))
				{
			return "Scheme B";
				}
		else if(salary>=40000 && designation.equalsIgnoreCase("manager"))
		{
			return "Scheme A";
		}
		else if(salary<5000 && designation.equalsIgnoreCase("clerk"))
		{
			return "no scheme";
		}
		else
		{
			return null;
		}
	}

}
