package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;


public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("signup")) {
			boolean flag = UserDao.checkMail(request.getParameter("email"));
			if(flag==false) {
				if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
					User u = new User();
					u.setUsertype(request.getParameter("usertype"));
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setMobile(Long.parseLong(request.getParameter("mobile")));
					u.setAddress(request.getParameter("address"));
					u.setPassword(request.getParameter("password"));
					UserDao.signupUser(u);
					request.setAttribute("msg", "User signed up successfully.");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password and confirm password does not match.");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Email already registered. Please login.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login")) {
			User u = UserDao.loginUser(request.getParameter("email"));
			if(u!=null) {
				if(u.getPassword().equals(request.getParameter("password"))) {
					HttpSession session = request.getSession();
					session.setAttribute("u", u);
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Incorrect password.");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Email not registered.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
	}
}
