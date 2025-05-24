<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
  int id=Integer.parseInt(request.getParameter("id1"));
  System.out.println(id);
%>

<%
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","9712");
     System.out.println("connected");
     PreparedStatement ps=con.prepareStatement("delete from student where id=?");
     ps.setInt(1, id);
     ps.execute();
     System.out.println("end");
 
%>
</body>
</html>