package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Lab1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String Pass=req.getParameter("Pass");
		
//		PrintWriter pw=resp.getWriter();
//		pw.print(id);
//		pw.print(Pass);
		
		resp.sendRedirect("http://WWW.Google.com");
	}
}
