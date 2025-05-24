package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlets2")
public class Servlets2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		   //String name=req.getParameter("name");
		     String name=(String)req.getAttribute("name");
		    
		
		    resp.setContentType("text/html");
		    
		    PrintWriter pw=resp.getWriter();
		    pw.print("<!DOCTYPE html>");
	        pw.print("<html>");
	        pw.print("<head>");
	        pw.print("<title>Servlet Servlet1</title>");
	        pw.print("</head>");
	        pw.print("<body>");
	        
	    	pw.println("<h1>Hello ,"+name+" Welcome back to my website</h1>");
			pw.println("<h1>Thank you !!</h1>");
			
			pw.println("<form action='/Home'>");
			pw.println("<input type='sumbit' value='To Home'>");
		     pw.print("</form>");
		     
		     pw.println("<form action='/about_us'>");
				pw.println("<input type='sumbit' value='about us'>");
			     pw.print("</form>");
		     
		     pw.print("</body>");
		     pw.print("</html>");
	}
}
