package com.deity.struts.util;

public class UserManager {
	
	public static String login(String account,String password) {
		if (account.equals("admin") && password.equals("admin")) {
			return "success";
		}else{
			return "error";
		}
	}
}
