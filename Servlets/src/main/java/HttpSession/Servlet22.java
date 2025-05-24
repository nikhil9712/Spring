package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sservlet12")
public class Servlet22 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
	  pw.print("<!DOCTYPE html>");
      pw.print("<html>");
      pw.print("<head>");
      pw.print("<title>Profile Page</title>");
      pw.print("</head>");
      pw.print("<body>");
      pw.println("<h1>Hello, " + name + ". Welcome Back!!</h1>");
      pw.print("</body>");
      pw.print("</html>");
	}
}
