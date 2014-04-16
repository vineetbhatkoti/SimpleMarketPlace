package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Advertisement;
import service.AdvertisementImplService;
import service.Advertisement_Type;


/**
 * Servlet implementation class AdOperation
 */
@WebServlet("/AdOperation")
public class AdOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdvertisementImplService service = new AdvertisementImplService();
	Advertisement adProxy = service.getAdvertisementImplPort();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showAds")!=null)
		{System.out.println(" inside the ad request ");
		request.setAttribute("ads", adProxy.getAllAds());
			System.out.println(" getting to the all the ads");
			RequestDispatcher rd = request.getRequestDispatcher("/View/ShowAd.jsp");
			rd.forward(request, response);
		}
		if(request.getParameter("postAd")!=null)
		{System.out.println(" inside the Posting the ad request ");
		//request.setAttribute("ads", adProxy.getAllAds());
			RequestDispatcher rd = request.getRequestDispatcher("/View/PostAd.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=(String) request.getSession().getAttribute("userName");
		String itemName=request.getParameter("itemName");
		String itemdes=request.getParameter("itemDescription");
		String itemPrice=request.getParameter("itemPrice");
		String quantity=request.getParameter("quantity");
		System.out.println(itemName);
		System.out.println(itemdes);
		System.out.println(itemPrice);
		System.out.println(quantity);
		int quant=0,price=0;
		boolean flag=false;
		try{
			quant=Integer.parseInt(quantity);
			price=Integer.parseInt(itemPrice);	
			
		}
		catch (NumberFormatException e) {
			flag=true;
			request.getSession().setAttribute("message", "Please enter number in qualtity and price column");
			RequestDispatcher rd = request.getRequestDispatcher("/View/PostAd.jsp");
			rd.forward(request, response);
		}
		finally{
			if(flag==false)
			{
			adProxy.postAd( userName,itemName, itemdes, quant,price);
			System.out.println("Ad has been posted ... Hurray !!");
			request.getSession().setAttribute("message", "The Ad has been posted");
			RequestDispatcher rd = request.getRequestDispatcher("/View/Home.jsp");
			rd.forward(request, response);
			}
		}
		
	
		
	}

}
