package service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import dto.AdCart;





@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface Advertisement {
	@WebMethod
	List<dto.Advertisement> getAllAds();
	
	@WebMethod
	void addAdToCart(int advertisementId,int quantity, String UserName);
	
	@WebMethod
	List<AdCart> getItemsFromCart(String UserName);
	
	@WebMethod
	void removeAdFrmCart(int cartId,String userName);
	
	@WebMethod
	void orderAd(String UserName);
	
	@WebMethod
	void postAd(String UserName,String itemName,String itemDescription,int quantity,int itemPrice);
	
	@WebMethod
	void SignUp(String firstName,String lastName,String UserName,String password,String address,String phone,String email);
}
