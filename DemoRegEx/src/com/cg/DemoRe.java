package com.cg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new Scanner(System.in).next().trim();
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
		Matcher matcher=pattern.matcher(name);
		if(matcher.matches()) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
		
		
	}

}
