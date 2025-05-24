package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward1")

public class Forward1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String pass=req.getParameter("pass");
		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(pass);
//		
//		PrintWriter pw=resp.getWriter();
//		pw.println(name);
//		pw.println(age);
//		pw.println(pass);
		
		req.setAttribute("Name",name );
		RequestDispatcher rd=req.getRequestDispatcher("H2.html");
		rd.forward(req, resp);
	}
}
