package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Hi")
public class CookiesDemo extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name=req.getParameter("name");
      
    	
    	resp.setContentType("text/html;charset=UTF-8");
    	
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Servlet Servlet1</title>"); 
        pw.print("</head>"); 
        pw.print("<body>");
        pw.println("<h1>Hello ,"+name+"Welcome to my website</h1>");
        pw.print("<h1><a href='C2'>Go to servlet 2</a></h1>");
       
        Cookie cookie1=new Cookie("user_name", name);
    	resp.addCookie(cookie1);
        pw.print("<body>");
        pw.print("<html>");
        
    	
    
    	

    }
}
