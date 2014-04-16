package service;

import java.util.List;

import javax.jws.WebService;

import dto.AdCart;

import Connection.AdvertisementDAO;
@WebService(endpointInterface = "service.Advertisement")
public class AdvertisementImpl implements Advertisement{
	AdvertisementDAO advertisementDAO= new AdvertisementDAO();
	
	@Override
	public List<dto.Advertisement> getAllAds()
	{
		
		return advertisementDAO.getAllAds();
		
	}

	@Override
	public void addAdToCart(int advertisementId, int quantity, String UserName) {
		advertisementDAO.addAdToCart(advertisementId, quantity,UserName);
		
	}

	@Override
	public List<AdCart> getItemsFromCart(String UserName) {
		return advertisementDAO.getItemsFromCart(UserName);
	}

	@Override
	public void removeAdFrmCart(int cartId, String userName) {
		advertisementDAO.removeAdFrmCart(cartId,userName);		
	}

	@Override
	public void orderAd(String UserName) {
		advertisementDAO.orderAd(UserName);				
	}

	@Override
	public void postAd(String UserName, String itemName,
			String itemDescription, int quantity, int itemPrice) {
		advertisementDAO.postAd(UserName,itemName,itemDescription,quantity,itemPrice);		
		
	}

	@Override
	public void SignUp(String firstName, String lastName, String UserName,
			String password, String address, String phone, String email) {
		advertisementDAO.SignUp( firstName, lastName, UserName,
				 password, address,  phone,  email);
	}
}
