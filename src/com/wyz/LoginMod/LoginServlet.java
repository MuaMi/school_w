package com.wyz.LoginMod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 * @param phone手机号
	 * @param pass密码
	 * @throws Exception
	 * 
	 * @author 姜华起  @time 2016.2.29
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phone = request.getParameter("phone");
		String pass = request.getParameter("password");
		String loginResponse = " ";
		
		try {
			loginResponse = LoginDao.StuLogin(phone,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("login", loginResponse);
		request.getRequestDispatcher("/web-app/login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
   }
	
}
