package com.deity.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class LoginForm extends ActionForm {
	
	private String username;
    private String password;

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        System.out.println("--------reset()-------------");
        super.reset(mapping, request);
    }

    public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {
        System.out.println("--------validate()-------------");
        return super.validate(mapping, request);
    }

    public String getUsername() {
    	System.out.println("getUsername()");
        return username;
    }

    public void setUsername(String username) {
    	System.out.println("setUsername()");
        this.username = username;
    }

    public String getPassword() {
    	System.out.println("getPassword()");
        return password;
    }

    public void setPassword(String password) {
    	System.out.println("setPassword()");
        this.password = password;
    }
}
