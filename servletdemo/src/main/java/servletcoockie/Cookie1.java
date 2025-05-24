package servletcoockie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie1")
public class Cookie1 extends HttpServlet
{
   
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    {
    	String id=req.getParameter("id");
    	String pass=req.getParameter("pass");
    	
    	Cookie user1=new Cookie("Nikhil","9712");
    	Cookie user2=new Cookie("Ajay","6445");
    	
    	res.addCookie(user1);
    	res.addCookie(user2);
    }
}
