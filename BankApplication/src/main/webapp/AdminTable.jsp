<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Information</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","9712");
Statement statement=con.createStatement();
ResultSet rs=statement.executeQuery("select * from admindetails");
%>


<table cellpadding="20px" align="center" border="2">
<th>Id</th>
<th>Email</th>
<th>Password</th>


<%while(rs.next()) { %>

<tr>
  <td><%=rs.getInt(1)%> </td>
  <td><%=rs.getString(2) %> </td>
  <td><%=rs.getString(3) %> </td>
 
</tr>
<%} %>





</body>
</html>