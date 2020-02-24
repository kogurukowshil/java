

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;



public class LoginDao1 extends HttpServlet {
	
    public LoginDao1() 
    {
    	String sql="select * from cog where uname=? and pass=?";
    	String url="jdbc:mysql://localhost:3306/kowshil";
    	String username="root";
    	String password="root";
    	public boolean check(String uname,String pass)
    	{
    		try
    		{
    			Class.forName=("com.mysql.jdbc.Driver");
    			Connection con=DriverManager.getConnection(url,username,password);
    			PreparedStatement st=con.clientPrepareStatement(sql);
    			st.setString(1, uname);
    			st.setString(2, pass);
    			ResultSet rs=st.executeQuery();
    			if(rs.next())
    			{
    				return true;
    			}
    		}catch(Exception e)
    		  e.printStackTrace;
    	}
    	
    }

    }
   
