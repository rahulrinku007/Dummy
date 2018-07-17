package com.cg.employeelogin.staticdb;

import java.util.HashMap;

public class LoginDataBase {
	private static HashMap<String, String> HashMap = null;
	static {
		HashMap = new HashMap<>();

	}

	public static HashMap<String, String> getLoginDetails() {
		HashMap.put("Rahul", "Rahul");
		HashMap.put("Admin", "Admin");
		return HashMap;
	}
}
