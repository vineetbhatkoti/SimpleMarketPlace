package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Advertisement;
import service.AdvertisementImplService;

/**
 * Servlet implementation class Payment
 */
@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdvertisementImplService service = new AdvertisementImplService();
	Advertisement adProxy = service.getAdvertisementImplPort();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/View/Payment.jsp");
		rd.forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cardNumber = request.getParameter("cardNumber");
		if(cardNumber.length()!=16)
		{
			System.out.println("Imvalid card number");
			request.getSession().setAttribute("message", "Invalid card number....Please enter details again");
			RequestDispatcher rd = request.getRequestDispatcher("/View/Payment.jsp");
			rd.forward(request, response);
		}
		else
		{
			String userName=(String) request.getSession().getAttribute("userName");
			adProxy.orderAd(userName);
			RequestDispatcher rd = request.getRequestDispatcher("/View/Thanks.jsp");
			rd.forward(request, response);
		}
	}

}
