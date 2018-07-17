package com.cg.employeelogin.service;

import com.cg.employeelogin.dto.UserBean;
import com.cg.employeelogin.exception.MyLoginException;

public interface ILoginService {
public boolean validateLogin(UserBean userBean);
public boolean verifyLogin(UserBean userBean) throws MyLoginException;
	
	
}
