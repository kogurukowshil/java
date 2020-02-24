

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Hello extends HTTPServlet {
	protected void doPost(HttpServletRequest req,HttpServletRequest response) throws ServletException, IOException {
		

		System.out.println("hello");
		response.SetContentType("text/html");;
		PrintWriter pw=response.getWriter();
		ServletRequest requ;
		String s1=requ.getParameter("t1");
		String s2=requ.getParameter("t2");
		pw.println(s1+""+s2);
		//pw.print("hhhh");
		
		/*try
		{
			String url=getServletContext().getInitParameter("url");
			String user=getServletContext().getInitParameter("user");
			String password=getServletContext().getInitParameter("password");
			
			Class.forName(getServletContext().getInitParameter("driver");
			Connection con=DriverManager.getConnection("url","user","password");
			System.out.println("connecting");
			
		}
		catch(ClassNotFoundException | SQLException cf)
		{
			System.out.println(cf);
		}*/
		
	}

	}



