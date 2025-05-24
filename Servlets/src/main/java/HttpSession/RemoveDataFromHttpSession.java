package HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/rem11")
public class RemoveDataFromHttpSession extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
		hs.setAttribute("name","Pranav");
		hs.setAttribute("age", 20);
		
		System.out.println(hs.getAttribute("name")); //name as a key
		
		hs.removeAttribute("name"); //key is in String form so use brackets
		
		System.out.println(hs.getAttribute("name"));
	}
}
