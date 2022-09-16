

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginAuthentication
 */

public class LoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAuthentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String userid = request.getParameter("userid");
String pass = request.getParameter("pass");
RequestDispatcher rd1 = request.getRequestDispatcher("successfulLogin.jsp");
RequestDispatcher rd2 = request.getRequestDispatcher("unsuccessfulLogin.jsp");


if(userid.equals("Ryan") && pass.equals("pass123"))
{rd1.forward(request, response);	

//response.sendRedirect("successfulLogin.jsp");	
}else
	
{
	//response.sendRedirect("unsuccessfulLogin.jsp");
	rd2.forward(request, response);
}


	}
}
