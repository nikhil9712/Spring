<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch Students</title>
</head>
<body>
<%
 

     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","9712");
     Statement statement=con.createStatement();
     ResultSet rs=statement.executeQuery("select * from student");
    
%>

<table cellpadding="20px" align="center" border="2">
<th>Id</th>
<th>Name</th>
<th>MobileNumber</th>
<th>Email</th>
<th>Password</th>
<th>YOP</th>

<%while(rs.next()) { %>

<tr>
  <td><%=rs.getInt(1)%> </td>
  <td><%=rs.getString(2) %> </td>
  <td><%=rs.getLong(3) %> </td>
  <td><%=rs.getString(4) %> </td>
  <td><%=rs.getString(5) %> </td>
  <td><%=rs.getInt(6) %> </td>
</tr>
<%} %>

</table>
 
</body>
</html>