package HttpSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlethttp1")
public class GetData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String pass=req.getParameter("pass");
		
		HttpSession hs=req.getSession();
		hs.setAttribute("name", id);
		hs.setAttribute("pass", pass);
		
		RequestDispatcher d=req.getRequestDispatcher("display1.html");
		d.forward(req, resp);
		
	}
}
