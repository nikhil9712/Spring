package HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/removealldata")
public class RemoveAllDataFromHttpSession extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
		
		hs.setAttribute("name","sangham");
		hs.setAttribute("age", 23);
		
		System.out.println(hs.getAttribute(getServletName()));
		System.out.println(hs.getAttribute(getServletName()));
	
		hs.removeAttribute("name");
		System.out.println(hs.getAttribute(getServletName()));
		
		hs.invalidate();
	//	System.out.println(hs.getAttribute(getServletName())); 
		//Error because no object is present 
		
		
	}
	
}
