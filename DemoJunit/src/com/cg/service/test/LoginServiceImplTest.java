package com.cg.service.test;

import static org.junit.Assert.*;

import java.security.Provider.Service;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.service.ILoginService;
import com.cg.service.LoginServiceImpl;

public class LoginServiceImplTest {
	
	private static ILoginService service=null;
	
	@BeforeClass
	public static void initialize() {
		service=new LoginServiceImpl();
	}

	@Test
	public void testForBlankInputs() {
		//ILoginService service=new LoginServiceImpl();
		boolean output=service.login("","");
		assertFalse(output);
		
	}
	@Test
	public void testForBlankOutputs() {
		//ILoginService service=new LoginServiceImpl();
		boolean output=service.login("admin","admin");
		assertTrue(output);
		
	}

}
