package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/about_us")
public class About_Us extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String name=req.getParameter("name");
		 HttpSession session=req.getSession();
	     String name=(String)session.getAttribute("name");
	     resp.setContentType("text/html");
	    
	    PrintWriter pw=resp.getWriter();
	    pw.println("<h1>Hello ,"+name+" Welcome tp About_Us page</h1>");
	    
	    
//	    pw.println("<form action='Mapping'>");
//	    pw.println("<input type='submit' value='Profile Page'>");
//	    pw.println("</form>");
	    pw.print("<a href='Home'>Home</a>");
//	    pw.println("<form action='Home'>");
//	    pw.println("<input type='submit' value='To Home Page'>");
//	    pw.println("</form>");
	    pw.print("<a href='Mapping'>Profile</a>");
	    
	    pw.print("<a href='login.html'>Logout</a>");
	    
	   
	}
}
