<%@page import="java.sql.PreparedStatement"%>
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
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
int id1=Integer.parseInt(id);
%>
<% 
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","9712");
     PreparedStatement ps=con.prepareStatement("select * from student where id=?");
     ps.setInt(1, id1);
     ResultSet rs=ps.executeQuery();
  if(rs.next()) 
  {
%>

<table cellpadding="20px" align="center" border="2">
<th>Id</th>
<th>Name</th>
<th>MobileNumber</th>
<th>Email</th>
<th>Password</th>
<th>YOP</th>

<tr>
  <td><%=rs.getInt(1)%> </td>
  <td><%=rs.getString(2) %> </td>
  <td><%=rs.getLong(3) %> </td>
  <td><%=rs.getString(4) %> </td>
  <td><%=rs.getString(5) %> </td>
  <td><%=rs.getInt(6) %> </td>
</tr>
<%}
else
{
	out.println("id not found");
	}
%>



</table>
</body>
</html>