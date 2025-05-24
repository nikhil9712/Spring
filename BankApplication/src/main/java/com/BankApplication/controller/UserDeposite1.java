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

@WebServlet("/deposite")
public class UserDeposite1 extends HttpServlet{
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String pin=req.getParameter("pin");
		String address=req.getParameter("address");
		String accno=req.getParameter("accno");
		String amount=req.getParameter("amount");
		
		int id1=Integer.parseInt(id);
		int pin1=Integer.parseInt(pin);
		long accno1=Long.parseLong(accno);
		int amount1=Integer.parseInt(amount);
		
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
				balance=balance+amount1;
				PreparedStatement ps1=con.prepareStatement("update account set balance=? where accountnumber=? and pin=?");
				ps1.setInt(1, balance);
				ps1.setLong(2, accno1);
				ps1.setInt(3, pin1);
				ps1.execute();
				
			
				PrintWriter pw=resp.getWriter();
				  pw.print("<h1 align='center' style='color:green'>Successfully Deposited...<h1>");
				  RequestDispatcher rd=req.getRequestDispatcher("WelcomePage.html");
				  rd.include(req, resp);
			} else 
			{
				 PrintWriter pw=resp.getWriter();
				  pw.print("<h1 align='center' style='color:green'>Invalid credentials...<h1>");
				  RequestDispatcher rd=req.getRequestDispatcher("WelcomePage.html");
				  rd.include(req, resp);
			}
			
			
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
