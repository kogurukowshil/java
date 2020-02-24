import java.io.*;
import java.sql.*;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("Helloworld")
public class Initparam1 extends HttpServlet {
protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.print("<h1>Init Parameters Names are:");
Enumeration enumeration=getServletContext().getInitParameterNames();
while(enumeration.hasMoreElements()) {
out.print(enumeration.nextElement());
}
ServletContext conl=getServletContext();
out.println("<h1>Company:"+conl.getInitParameter("Company"));
out.println("Venue:"+conl.getInitParameter("Venue"));
out.println("Training:"+conl.getInitParameter("Training"));

out.print("<h1>Company:"+getServletContext().getInitParameter("Company"));
out.print("Venue:"+getServletContext().getInitParameter("Venue"));
out.print("Training:"+getServletContext().getInitParameter("Training"));

}
}
