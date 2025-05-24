package com.BankApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validateAdmin")
public class UserLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Enteredemail=req.getParameter("email");
		String Enteredpassword=req.getParameter("password");
		
		System.out.println(Enteredemail);
		System.out.println(Enteredpassword);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
		PreparedStatement ps=con.prepareStatement("select * from admindetails where email=? and password=?");
		
		ps.setString(1, Enteredemail);
		ps.setString(2, Enteredpassword);
		
		ResultSet rs=ps.executeQuery();
		
        if (rs.next()) {
        	PrintWriter pw=resp.getWriter();
        	  pw.print("<h1 align='center' style='color:green'>Login Successful...<h1>");
        	RequestDispatcher rd=req.getRequestDispatcher("WelcomeAdmin.html");
        	rd.include(req, resp);
		} else {
			PrintWriter pw=resp.getWriter();
			  pw.print("<h1 align='center' style='color:green'>Invalid Credentials !!...<h1>");
           RequestDispatcher rd=req.getRequestDispatcher("loginAdmin.html");
           rd.include(req, resp);
		}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
