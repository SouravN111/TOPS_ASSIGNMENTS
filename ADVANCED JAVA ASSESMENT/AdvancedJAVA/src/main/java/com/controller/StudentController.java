package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			boolean flag = StudentDao.checkEmail(request.getParameter("email"));
			if(flag == false) {
				if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
					Student s = new Student();
					s.setFname(request.getParameter("fname"));
					s.setLname(request.getParameter("lname"));
					s.setEmail(request.getParameter("email"));
					s.setMobile(Long.parseLong(request.getParameter("mobile")));
					s.setAddress(request.getParameter("address"));
					s.setPassword(request.getParameter("password"));
					StudentDao.insertStudent(s);
					request.setAttribute("msg", "Data  inserted successfully.");
					
//					response.sendRedirect("index.jsp");
					request.getRequestDispatcher("show.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password and confirm password does not match.");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				
				}
			}
			else {
				request.setAttribute("msg", "Email already registered.");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			StudentDao.deleteStudent(id);
			request.setAttribute("msg", "Data deleted successfully");
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Student s = StudentDao.getStudent(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			Student s = new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setPassword(request.getParameter("password"));
			StudentDao.updateStudent(s);
			request.setAttribute("msg", "Data updated successfully.");
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update profile")) {
			Student s = new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setAddress(request.getParameter("address"));
			s.setPassword(request.getParameter("password"));
			StudentDao.updateStudent(s);
			request.setAttribute("msg", "Profile updated successfully.");
			HttpSession session = request.getSession();
			session.setAttribute("s", s);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("login")) {
			Student s = StudentDao.checkLogin(request.getParameter("email"));
			if(s!=null) {
				if(s.getPassword().equals(request.getParameter("password"))) {
					HttpSession session = request.getSession();
					session.setAttribute("s", s);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Incorrect password");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Email not registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("change password")) {
			HttpSession session = request.getSession();
			Student s = (Student) session.getAttribute("s");
			if(s.getPassword().equals(request.getParameter("old_password"))) {
				if(request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
					if(!s.getPassword().equals(request.getParameter("new_password"))) {
						StudentDao.changePassword(s.getEmail(), request.getParameter("new_password"));
						session.removeAttribute("s");
						session.invalidate();
						request.setAttribute("msg", "Password changed successfully. Please login again");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
					else {
						request.setAttribute("msg", "New password can't be from your one of the old password.");
						request.getRequestDispatcher("change-password.jsp").forward(request, response);
					}
				}
				else {
					request.setAttribute("msg", "New password and confirm new password does not match.");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old pasword does not match.");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
	}
}
