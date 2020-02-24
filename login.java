

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		   String password=request.getParameter("pass");
		   
		    	  if(name.equals("kowshil")&&password.equals("arjun"))
		    	   {
		    		   response.sendRedirect("NewFile3.html");
		    	   }
		    	   else
		    	   {
		    		   response.sendRedirect("Helloworld.html");
		    	   }
		
	}


	
}
