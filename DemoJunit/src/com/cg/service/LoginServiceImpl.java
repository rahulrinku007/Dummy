package com.cg.service;

import com.cg.dao.ILoginDao;
import com.cg.dao.LoginDaoImpl;

public class LoginServiceImpl implements ILoginService
{
	private ILoginDao dao=null;
	public LoginServiceImpl() {
		dao=new LoginDaoImpl();
	}
	
	public boolean login(String userName,String password) {
		boolean result=false;
		if(userName.trim().length()>4&&password.trim().length()>4) {
			result=dao.login(userName,password);
		}
		return result;
	}

}
