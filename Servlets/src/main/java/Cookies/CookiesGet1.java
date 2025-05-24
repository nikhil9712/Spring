package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookies1")
public class CookiesGet1 extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		Cookie user1=new Cookie("Nikhil","8888");
		Cookie user2=new Cookie(name,"8888");
		Cookie user3=new Cookie("Vijay",pass);
		Cookie user4=new Cookie("Rushabh", "Zadipura@123");
		
		res.addCookie(user1);
		res.addCookie(user2);
		res.addCookie(user3);
		
		PrintWriter pw=res.getWriter();
		pw.print(user1);
		RequestDispatcher d=req.getRequestDispatcher("Cookieget2.html");
		d.forward(req, res);
	}
}
