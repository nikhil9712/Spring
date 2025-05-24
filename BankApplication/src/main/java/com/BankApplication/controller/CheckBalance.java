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

@WebServlet("/CheckBalance")
public class CheckBalance extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String accno=req.getParameter("accno");
		String pin=req.getParameter("pin");
		
		long accno1=Long.parseLong(accno);
		int pin1=Integer.parseInt(pin);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
			PreparedStatement ps=con.prepareStatement("select * from account where accountnumber=? and pin=?");
			ps.setLong(1, accno1);
			ps.setInt(2, pin1);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next())
			{
				int balance=rs.getInt(6);
				
				PrintWriter pw=resp.getWriter();
				  pw.print("<h1 align='center' style='color:green'>balance:"+balance+"<h1>");
				  RequestDispatcher rd=req.getRequestDispatcher("WelcomePage.html");
				  rd.include(req, resp);
			} else 
			{
				 PrintWriter pw=resp.getWriter();
				  pw.print("<h1 align='center' style='color:green'>Invalid credentials...<h1>");
				  RequestDispatcher rd=req.getRequestDispatcher("WelcomePage.html");
				  rd.include(req, resp);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
