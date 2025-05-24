package Servlets1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class task11 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter pw=res.getWriter();
		
		pw.print(name);
		pw.print(email);
		pw.print(pass);
		
		
	}

}
