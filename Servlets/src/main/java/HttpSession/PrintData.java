package HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet22")
public class PrintData  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
		
		String name=(String)hs.getAttribute("name");
		int id=(Integer)hs.getAttribute("id");
		
		System.out.println(name);
		System.out.println(id);
		
	}
}
