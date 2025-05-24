package HttpSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fetchdatafromanotherservlet")
public class FetchDataFromAnotherServlet {

	private void doPost(HttpServletRequest req,HttpServletResponse res) 
	{
		
      /* getsession method create the object of object of implmnt class of
       HttpSession interface
       the object ois stored in server any every time same object is shared so 
       the data stored in httpservlet is not limited to the
       particular servlet it is available throughout the servet i.e. the application
       */
		
		HttpSession hp1= req.getSession();
		System.out.println(hp1);
		
		String name=(String) hp1.getAttribute("name");
		int id=(Integer) hp1.getAttribute("id");
		int age=(Integer) hp1.getAttribute("age");
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
	
}
