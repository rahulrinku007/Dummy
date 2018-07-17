package com.cg.employeelogin.dao;

import java.util.HashMap;

import com.cg.employeelogin.dto.UserBean;
import com.cg.employeelogin.exception.IMyLoginExceptionMessages;
import com.cg.employeelogin.exception.MyLoginException;
import com.cg.employeelogin.staticdb.LoginDataBase;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public String getLoginPassword(UserBean userBean) throws MyLoginException {
		// TODO Auto-generated method stub
		String dbPassword="-1";
		try {
		HashMap<String,String>db=LoginDataBase.getLoginDetails();
		dbPassword=db.get(userBean.getUserName());
		}catch(Exception exception) {
			throw new MyLoginException(IMyLoginExceptionMessages.ERROR1);
		}
		return dbPassword;
	}
	

	
	
}
