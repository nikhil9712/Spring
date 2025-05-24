package Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C2")
public class Cookiesget2 extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		//Getting cookies
		
		Cookie [] cookies=req.getCookies();
		PrintWriter pw=res.getWriter();
		  
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<head>");
        pw.print("<body>");
		
		boolean f=false;
		String name="";
		if (cookies==null) 
		{
            pw.println("<h1>You are new user go to home page and submit your name</h1>");
			return;
		}
		else
		{  
			
			for (Cookie c : cookies) {
				String tname=c.getName();
				//it can have name , id, pass and we have to match name only so cookie.getname();
				if (tname.equals("user_name")) {
					f=true;
					name=c.getValue();
				}
			}
			
			if (f==true) {
				pw.println("<h1>Hello ,"+name+" Welcome back to my website</h1>");
				pw.println("<h1>Thank you !!</h1>");
				pw.println("<h1 >Trying Servlet After So Many time !!</h1>");
			}
			else
			{
				 pw.println("<h1>You are new user go to home page and submit your name</h1>");
			}
		}
		  
		  pw.print("<body>");
	      pw.print("<html>");
		
		
		
	}
}
