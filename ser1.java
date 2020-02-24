

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ser1 extends HttpServlet {

   
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String s1=request.getParameter("t1");
	  String s2=request.getParameter("t2");
	  PrintWriter p=response.getWriter();
	  p.println(s1+" "+s2);
	  response.setContentType("text/html");
	  
	}

}
