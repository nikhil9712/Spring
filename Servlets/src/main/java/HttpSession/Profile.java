package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Mapping")
public class Profile extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        
        
        HttpSession session=req.getSession();
        
        session.setAttribute("name", name);
        
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
//        pw.print("<!DOCTYPE html>");
//        pw.print("<html>");
//        pw.print("<head>");
//        pw.print("<title>Profile Page</title>");
//        pw.print("</head>");
//        pw.print("<body>");
        
        pw.println("<h1>Hello, " + name + ". Welcome to the Profile page!</h1>");

//	    pw.println("<form action='Home'>");
//        pw.println("<input type='submit' value='To Home'>");
//        pw.println("</form>");
        pw.print("<a href='Home'>Home</a>");
        
//	    pw.println("<form action='about_us'>");
//        pw.println("<input type='submit' value='About Us'>");
//        pw.println("</form>");
        
        pw.print("<a href='about_us'>About_us</a>");
        
//        pw.println("<form action='logout'>");
//        pw.println("<input type='submit' value='Logout'>");
//        pw.println("</form>");
        pw.print("<a href='login.html'>Logout</a>");
        
//        pw.print("</body>");
//        pw.print("</html>");
    }
}
