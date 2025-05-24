<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String numb1=request.getParameter("num1");
String numb2=request.getParameter("num2");

int number1=Integer.parseInt(numb1);
int number2=Integer.parseInt(numb2);

String choice=request.getParameter("choice");
System.out.println(choice);

if(choice.equals("addition"))
{
	response.getWriter().println("<h1>"+(number1+number2)+"</h1>");
	}
else if(choice.equals("substraction"))
{
	response.getWriter().println("<h1>"+(number1-number2)+"</h1>");
	}
else if(choice.equals("multiplication"))
{
	response.getWriter().println("<h1>"+(number1*number2)+"</h1>");
	}
else if(choice.equals("division"))
{
	response.getWriter().println("<h1>"+(number1/number2)+"</h1>");
	}
%>

<a href="Calculator1.html" >click here to go to previous page</a>
</body>
</html>