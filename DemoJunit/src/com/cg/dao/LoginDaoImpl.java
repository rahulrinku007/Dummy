package com.cg.dao;

public class LoginDaoImpl implements ILoginDao {
	
	public boolean login(String userName,String password) {
		boolean result=false;
		if(userName.equalsIgnoreCase("Admin")&&password.equalsIgnoreCase("admin")) {
			result=true;
		}
		return result;
	}
	

}
