package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/apply")
public class Apply extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		  String name=req.getParameter("name");
	      
		  PrintWriter pw=res.getWriter();
	      
	      String correctname="sanket";
	      String correctpass="1234";
	      RequestDispatcher d=req.getRequestDispatcher("welcome1.html");
	      pw.print("Hello  "+name+"  ");
	      d.include(req, res);
	      res.setContentType("text/html");
	}

	
}
