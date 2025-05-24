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

@WebServlet("/validate")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String accountnumber=req.getParameter("accountnumber");
		String pass=req.getParameter("pin");
		
		long accountnumber1=Long.parseLong(accountnumber);
		
		System.out.println(accountnumber);
		System.out.println(pass);
		
		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
				PreparedStatement ps=con.prepareStatement("select * from account where accountnumber=? and pin=?");
				
				ps.setLong(1, accountnumber1);
				ps.setString(2, pass);
				
				ResultSet rs=ps.executeQuery();
				
				if (rs.next()) 
				{
				  PrintWriter pw=resp.getWriter();
				  pw.print("<h1 align='center' style='color:green'>Login Successful...<h1>");
				  RequestDispatcher rd=req.getRequestDispatcher("WelcomePage.html");
				  rd.include(req, resp);
				} else
				{
					PrintWriter pw=resp.getWriter();
					 pw.print("<h1 align='center' style='color:green'>Invalid Credentials<h1>");
				   RequestDispatcher rd=req.getRequestDispatcher("login.html");
				 	  rd.include(req, resp);
				}
			
			}
			  
			  catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			/*  PrintWriter pw=resp.getWriter();
			  pw.print("<h1 align='center' style='color:green'>Account Created<h1>");
			  
			  RequestDispatcher rd=req.getRequestDispatcher("login.html");
			  rd.include(req, resp);
			  */
			  System.out.println("successful");
			  
			  
			
	}
}
