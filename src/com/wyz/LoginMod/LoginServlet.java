package com.wyz.LoginMod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 * @param xh 学号
	 * @param pass密码
	 * @throws Exception
	 * 
	 * @author 姜华起  @time 2016.2.29
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u_number = request.getParameter("u_number");
		String pass = request.getParameter("password");
		String status = request.getParameter("status");
		String loginResponse = " ";
		
		try {
			loginResponse = LoginDao.StuLogin(u_number,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (status.equals("1")){
			request.setAttribute("login", loginResponse);
			request.getRequestDispatcher("/web/student/index.jsp").forward(request, response);
		}else if(status.equals("2")){
			request.setAttribute("login", loginResponse);
			request.getRequestDispatcher("/web/teacher/index.jsp").forward(request, response);
		}else  if(status.equals("0")){
			request.setAttribute("login", loginResponse);
			request.getRequestDispatcher("/web/student/index.jsp").forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
   }
	
}
