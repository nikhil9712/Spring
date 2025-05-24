package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlets")
public class servlets extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("<h1>Welcome " + name + "</h1>");
        
        RequestDispatcher rd=req.getRequestDispatcher("/Servlets2");
        rd.include(req, resp);
    }
}
