package HttpSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/savadatainsession")
public class SaveDataInSession2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
		
		hs.setAttribute("id",1);
		hs.setAttribute("name","Nikhil");
		hs.setAttribute("age",23);
		
		int id=(Integer)hs.getAttribute("id");
		String name=(String)hs.getAttribute("name");
		Integer age=(Integer)hs.getAttribute("age");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		
		RequestDispatcher d=req.getRequestDispatcher("fetchdatafromanotherservlet");
		d.forward(req, resp);
	}
}
