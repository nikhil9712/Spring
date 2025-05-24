package Servlets1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet3")
public class servlet3 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("name");
		
		String email=req.getParameter("email");
		
		String pass=req.getParameter("pass");
		
		RequestDispatcher rd=req.getRequestDispatcher("welcome1.html");
		rd.forward(req, res);
	}

}
