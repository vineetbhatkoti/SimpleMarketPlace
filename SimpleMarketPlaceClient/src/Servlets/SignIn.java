package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.ServiceProxy;



/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceProxy proxy=new ServiceProxy();  
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String qdone;		 
		 try{			
			 	String user = request.getParameter("userName");
			 	String pass = request.getParameter("password");
			 	proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
				qdone = proxy.signIn(user,pass);
				HttpSession session = request.getSession();
				if(qdone.equalsIgnoreCase("false"))
				{
					request.getSession().setAttribute("message","User not authenticated ... Please enter correct Username/Password !!" );
					RequestDispatcher rd = request.getRequestDispatcher("/View/Login.jsp");
					rd.forward(request, response);
				}
				else
				{
					session.setAttribute("userSession", session);
					session.setAttribute("userName", user);
					session.setAttribute("lastLogin", qdone);
					System.out.println(" the date received is : "+qdone);
					RequestDispatcher rd = request.getRequestDispatcher("/View/Home.jsp");
					rd.forward(request, response);
				}
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}
	}


