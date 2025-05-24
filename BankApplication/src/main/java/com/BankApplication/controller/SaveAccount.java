package com.BankApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/saveaccount1")
public class SaveAccount extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  String id=req.getParameter("id");
	  String name=req.getParameter("name");
	  String age=req.getParameter("age");
	  String pin=req.getParameter("pin");
	  String address=req.getParameter("address");
	  
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(pin);
	  System.out.println(address);
	  
	  int id1=Integer.parseInt(id);
	  int age1=Integer.parseInt(age);
	  int pin1=Integer.parseInt(pin);
	  
	  Random r=new Random();
	  long accountno=r.nextLong(1000000001);
	  
	  System.out.println(accountno);
	  
	  double balance=5000;
	  System.out.println(balance);
	  
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
		PreparedStatement ps=con.prepareStatement("insert into account(id,name,age,accountnumber,pin,balance,address) values(?,?,?,?,?,?,?)");
		
		ps.setInt(1, id1);
		ps.setString(2, name);
		ps.setInt(3, age1);
		ps.setLong(4, accountno);
		ps.setInt(5, pin1);
		ps.setDouble(6, balance);
		ps.setString(7, address);
		
		
		ps.execute();
	}
	  
	  catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  PrintWriter pw=resp.getWriter();
	  pw.print("<h1 align='center' style='color:green'>Account Created<h1>");
	  
	  RequestDispatcher rd=req.getRequestDispatcher("login.html");
	  rd.include(req, resp);
	  
	  
	  
}
	
}
