package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward2")
public class Forward2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			String age=req.getParameter("age");
			String pass=req.getParameter("pass");
			
			
			PrintWriter pw=resp.getWriter();
			pw.println(name);
			pw.println(age);
			pw.println(pass);
			pw.println("From servlet 2");
	}
}
