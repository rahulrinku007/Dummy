package com.cg.employeelogin.ui;

import java.util.Scanner;

import com.cg.employeelogin.dto.UserBean;
import com.cg.employeelogin.exception.MyLoginException;
import com.cg.employeelogin.service.ILoginService;
import com.cg.employeelogin.service.LoginServiceImpl;

public class LoginClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username");
		String username=scanner.next();
		System.out.println("enter password");
		String password=scanner.next();
		ILoginService service=new LoginServiceImpl();
		UserBean userBean=new UserBean();
		userBean.setUserName(username);
		userBean.setPassword(password);
		boolean result=service.validateLogin(userBean);
		if (result) {
			boolean output = false;
			try {
				output = service.verifyLogin(userBean);
			} catch (MyLoginException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			
			}
			if (output) {
				System.out.println("Welcome"+username);
				
			} else {
				System.out.println("Invalid Login Try Again");
			}
			
		} else {
			System.out.println("Invalid Login Try Again");

		}
	}

}
