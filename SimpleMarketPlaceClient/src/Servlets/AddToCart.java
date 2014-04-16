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

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdvertisementImplService service = new AdvertisementImplService();
	Advertisement adProxy = service.getAdvertisementImplPort();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName=(String) session.getAttribute("userName");
		request.setAttribute("retrieveCart", adProxy.getItemsFromCart(userName));
		RequestDispatcher rd = request.getRequestDispatcher("/View/Cart.jsp");
		rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("action").equals("addToCart")) {
			Integer adId = Integer.valueOf(request.getParameter("ad_id"));
			System.out.println(" the ad id is ----->"+adId);
			Integer quantityOrdered = Integer.valueOf(request.getParameter("quantityOrder"));
			HttpSession session = request.getSession();
			String userName=(String) session.getAttribute("userName");
			System.out.println("The username :"+userName);
			System.out.println(" the quantity is ----->"+quantityOrdered);
			adProxy.addAdToCart(adId, quantityOrdered, userName);
		//	Advertisement ad = adProxy.getAd(adId);
			//adProxy.addToCart(ad);
			//adProxy.modifyQuantity(adId, 1, false);
		}
		if(request.getParameter("action").equals("removeItemFrmCart"))
		{
			System.out.println(" Going to remove a item from the cart");
			Integer cartId = Integer.valueOf(request.getParameter("cartId"));
			System.out.println("The cart id is :"+cartId);
			HttpSession session = request.getSession();
			String userName=(String) session.getAttribute("userName");
			adProxy.removeAdFrmCart(cartId, userName);
		}
		
		
		
	}

}
