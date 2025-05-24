package Servlets1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet2")
public class servlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		pw.println("Welcome");
		
		RequestDispatcher d=req.getRequestDispatcher("servlet3");
		d.forward(req, res);
		
		
	}

}
