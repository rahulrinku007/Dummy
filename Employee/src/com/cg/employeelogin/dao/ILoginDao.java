package com.cg.employeelogin.dao;

import com.cg.employeelogin.dto.UserBean;
import com.cg.employeelogin.exception.MyLoginException;

public interface ILoginDao {
public String getLoginPassword(UserBean userBean) throws MyLoginException; 
	

}
