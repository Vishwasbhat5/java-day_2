package com.sonata.Servenet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class registerdisplay
 */
public class registerdisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerdisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {  
       PrintWriter out = response.getWriter();  
       response.setContentType("text/html");  
       out.println("<html><body>");  
       try 
       {  
           Class.forName("com.mysql.jdbc.Driver");  
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root@123");  
           // Here dsname- customers, user id- root,password is root@123.  
           java.sql.Statement stmt = connection.createStatement();  
           ResultSet rs = stmt.executeQuery("select * from customertable");  
           out.println("<table border=1 width=50% height=50%>");  
           out.println("<tr><th>CustomerId</th><th>Name</th><th>Password</th><th>email</th><th>contact</th><tr>");  
           while (rs.next()) 
           {  
               String cid = rs.getString("CustomerId");  
               String nm = rs.getString("Name");    
                 String pd = rs.getString("Password");
                   String eml = rs.getString("email");
                     String cnt = rs.getString("contact");
               out.println("<tr><td>" + cid + "</td><td>" + nm + "</td><td>" + pd + "</td><td>" + eml + "</td><td>" + cnt + "</td></tr>");   
           }  
           out.println("</table>");  
           out.println("</html></body>");  
           connection.close();  
          }  
           catch (Exception e) 
          {  
           out.println("error");  
       }  
   }  
	

}
