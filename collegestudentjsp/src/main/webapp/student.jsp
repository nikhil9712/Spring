<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String id=request.getParameter("id");
 String name=request.getParameter("name");
 String mobilenumber=request.getParameter("mobilenumber");
 String email=request.getParameter("email");
 String password=request.getParameter("password");
 String yop=request.getParameter("yop");
 
 int id1=Integer.parseInt(id);
 long mobilenumber1=Long.parseLong(mobilenumber);
 int yop1=Integer.parseInt(yop);
 
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","9712");
 PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");

 ps.setInt(1, id1);
 ps.setString(2, name);
 ps.setLong(3,mobilenumber1 );
 ps.setString(4, email);
 ps.setString(5, password);
 ps.setInt(6, yop1);
 
 ps.execute();
 System.out.println("Data saved successfully !!");
 

%>
</body>
</html>