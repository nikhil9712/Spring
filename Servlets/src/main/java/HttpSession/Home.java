package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Home")
public class Home extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	  
	PrintWriter pw=resp.getWriter();
	HttpSession session=req.getSession();
	String name=(String)session.getAttribute("name");
    resp.setContentType("text/html");
   
  
    pw.println("<h1>Hello ,"+name+" Welcome tp Home page</h1>");
    
//    pw.println("<form action='Mapping'>");
//    pw.println("<input type='submit' value='Profile Page'>");
//    pw.println("</form>");
    pw.print("<a href='Mapping'>Profile</a>");
//    pw.println("<form action='about_us'>");
//    pw.println("<input type='submit' value='About Us'>");
//    pw.println("</form>");
    pw.print("<a href='about_us'>About_us</a>");
//    pw.println("<form action='logout'>");
//    pw.println("<input type='submit' value='Logout'>");
//    pw.println("</form>");
    
    pw.print("<a href='login.html'>Logout</a>");
}
}
