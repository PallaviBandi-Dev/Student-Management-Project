package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.dao.AdminDAO;
import com.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");

        Admin admin = new Admin(username,password);
        AdminDAO adminDAO = new AdminDAO();
        try {
			adminDAO.saveAdmin(admin);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         RequestDispatcher requestDispatcher =
                    req.getRequestDispatcher("index.html");
            requestDispatcher.forward(req, res);

      
        }
    }
	   
	
