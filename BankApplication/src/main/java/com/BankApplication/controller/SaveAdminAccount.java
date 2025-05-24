package com.BankApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveuser")
public class SaveAdminAccount extends HttpServlet {
 
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String Aid=req.getParameter("id");
	String Aemail=req.getParameter("email");
	String apassword=req.getParameter("password");
	
	int Aid1=Integer.parseInt(Aid);
	
	System.out.println(Aid);
	System.out.println(Aemail);
	System.out.println(apassword);
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
		PreparedStatement ps=con.prepareStatement("insert into admindetails values(?,?,?)");
		
		ps.setInt(1, Aid1);
		ps.setString(2, Aemail);
		ps.setString(3, apassword);
		
		ps.execute();
		System.out.println("Value Inserted Successfully !!");
	} 
	
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("classException");
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-genera'ted catch block
		System.out.println("sqlException111");
		e.printStackTrace();
		
	}
	
	  PrintWriter pw=resp.getWriter();
	  pw.print("<h1 align='center' style='color:green'>Admin Account Created<h1>");
	  
	  RequestDispatcher rd=req.getRequestDispatcher("loginAdmin.html");
	  rd.include(req, resp);
	  
	
}	
}
