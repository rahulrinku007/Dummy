package com.cg.employeelogin.service;

import com.cg.employeelogin.dao.ILoginDao;
import com.cg.employeelogin.dao.LoginDaoImpl;
import com.cg.employeelogin.dto.UserBean;
import com.cg.employeelogin.exception.MyLoginException;

public class LoginServiceImpl implements ILoginService {
	private ILoginDao dao;

	public LoginServiceImpl() {
		dao = new LoginDaoImpl();

	}

	@Override
	public boolean validateLogin(UserBean userBean) {
		// TODO Auto-generated method stub
		boolean result = false;
		if (userBean.getUserName().trim().length() > 4 && userBean.getPassword().trim().length() > 4) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean verifyLogin(UserBean userBean) throws MyLoginException {
		// TODO Auto-generated method stub
		boolean output=false;
		String dbPassword=dao.getLoginPassword(userBean);
		if (userBean.getPassword().equals(dbPassword)) {
			output=true;
			
		}
		
		return false;
	}

}
