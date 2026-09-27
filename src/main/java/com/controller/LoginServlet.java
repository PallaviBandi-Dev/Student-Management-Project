package com.controller;

import java.io.IOException;


import com.dao.AdminDAO;
import com.model.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {


		String username = req.getParameter("username"); 
		String password = req.getParameter("password");
		
		Admin admin = new Admin(username,password);
		AdminDAO adminDAO = new AdminDAO();
		
		
		
		
		
		
		
		
	}
	

}
