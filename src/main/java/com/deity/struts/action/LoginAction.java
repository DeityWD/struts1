package com.deity.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.deity.struts.form.LoginForm;
import com.deity.struts.util.UserManager;

public class LoginAction extends Action {
	
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm lf = (LoginForm) form;
        String username = lf.getUsername();
        String password = lf.getPassword();
        String errorInfo = "";
        String result = UserManager.login(username, password);
        if (result.equals("success")) {
            request.setAttribute("username", username);
            return mapping.findForward("success");
        } else if (result.equals("username")) {
            errorInfo = "密码错误";
        } else {
            errorInfo = "用户名错误";
        }
        request.setAttribute("errorInfo", errorInfo);
        return mapping.findForward("error");
    }
}
