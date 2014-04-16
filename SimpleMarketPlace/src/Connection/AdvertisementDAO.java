package Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AdCart;
import dto.Advertisement;
import dto.Member;



public class AdvertisementDAO {
	java.sql.Connection con = null;
	static java.sql.ResultSet rs;
    java.sql.Statement stmt = null;
	
	public AdvertisementDAO(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","bell123");
				stmt = con.createStatement();
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (java.sql.SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	
	public List<Advertisement> getAllAds() {
		List<Advertisement> allAdds = new ArrayList<Advertisement>();
		System.out.println("In the DAO-----> Retrieving alll the ads !!");
		try {
			String query = "select * from advertisement where item_quantity > 0";
			
			ResultSet r = stmt.executeQuery(query);
			while(r.next()) {
				Advertisement singleAd = new Advertisement();
				singleAd.setAdvertisementId(r.getInt("advertisementId"));
				singleAd.setItemDescription(r.getString("item_description"));
				singleAd.setItemName(r.getString("item_name"));
				singleAd.setItemPrice(r.getInt("item_price"));
				singleAd.setQuantity(r.getInt("item_quantity"));
				singleAd.setUserName(r.getString("userName"));
				allAdds.add(singleAd);
			}
			for(int i=0;i<allAdds.size();i++)
			{
				System.out.println("Ad id----"+allAdds.get(i).getAdvertisementId());
			}
			r.close();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 
		return allAdds;
	}




	public void addAdToCart(int advertisementId, int quantity, String userName) {
		System.out.println("Adding the advertisement to the cart ");
		int priceItem = 0,quantityInAdvertisement=0;
		try {
			String query = "select * from advertisement where advertisementId="+advertisementId;
			
			ResultSet r = stmt.executeQuery(query);
			while(r.next()) {
			 priceItem = r.getInt("item_price");
			 quantityInAdvertisement=r.getInt("item_quantity");
			}
			System.out.println(" The price of the item is : --->"+priceItem);
			int totalPrice=quantity*priceItem;
			String query1="insert into adcart values(null,'"+userName+"',"+advertisementId+","+quantity+","+totalPrice+")";
			int rowcount=stmt.executeUpdate(query1);
			System.out.println(" The rowcount is "+rowcount);
			
			int totalQuantityRemain=quantityInAdvertisement-quantity;
			String query3 = "update advertisement set item_quantity="+totalQuantityRemain+" where advertisementId="+advertisementId;
			int rowcount3=stmt.executeUpdate(query3);
			r.close();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 
	}




	public List<AdCart> getItemsFromCart(String userName) {
		System.out.println("Getting items from the cart for the person");
		List<AdCart> adCarts= new ArrayList<AdCart>();
		try {
			String query = "select * from adcart where userName='"+userName+"'";
			
			ResultSet r = stmt.executeQuery(query);
			while(r.next()) {
				AdCart adCart= new AdCart();
				adCart.setCartId(r.getInt("cartId"));
				adCart.setAdvertisementId(r.getInt("advertisementId"));
				adCart.setQuantityOrdered(r.getInt("quantityOrdered"));
				adCart.setTotalPrice(r.getInt("totalPrice"));
				adCarts.add(adCart);
			}
			for(int i=0;i<adCarts.size();i++)
			{
				System.out.println("Ad id----"+adCarts.get(i).getAdvertisementId());
				System.out.println("cart id ----"+adCarts.get(i).getCartId());
			}
			r.close();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 
		return adCarts;
	}




	public void removeAdFrmCart(int cartId, String userName) {
		System.out.println("Removing a ad from the cart ");
		int quantityFrmCart=0,advertisementId=0;
		try {
			String query1="select * from adcart where cartId="+cartId;
			ResultSet r = stmt.executeQuery(query1);
			while(r.next()){
			quantityFrmCart=r.getInt("quantityOrdered");
			advertisementId=r.getInt("advertisementId");
			}
			String query2="update advertisement set item_quantity=item_quantity+"+quantityFrmCart+" where advertisementId="+advertisementId;
			int rowcount4=stmt.executeUpdate(query2);
			System.out.println("The ros affected are :"+rowcount4);
			String query = "delete from adcart where userName='"+userName+"'"+"and cartId="+cartId;
			
			int rowcount=stmt.executeUpdate(query);
			System.out.println("The ros affected are :"+rowcount);
			r.close();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 		
	}




	public void orderAd(String userName) {
		System.out.println("Getting items from the cart for the person  and inserting it to order ");
		List<AdCart> adCarts= new ArrayList<AdCart>();
		try {
			String query = "select * from adcart where userName='"+userName+"'";
			
			ResultSet r = stmt.executeQuery(query);
			while(r.next()) {
				AdCart adCart= new AdCart();
				adCart.setCartId(r.getInt("cartId"));
				adCart.setAdvertisementId(r.getInt("advertisementId"));
				adCart.setQuantityOrdered(r.getInt("quantityOrdered"));
				adCart.setTotalPrice(r.getInt("totalPrice"));
				adCarts.add(adCart);
			}
			for(int i=0;i<adCarts.size();i++)
			{
				System.out.println("Ad id----"+adCarts.get(i).getAdvertisementId());
				System.out.println("cart id ----"+adCarts.get(i).getCartId());
				String query1 = "insert into adorder values(null,'"+userName+"',"+adCarts.get(i).getAdvertisementId()+","+adCarts.get(i).getQuantityOrdered()+","+adCarts.get(i).getTotalPrice()+")";
				int rowcount=stmt.executeUpdate(query1);
				System.out.println("The ros affected are :"+rowcount);
			}
			
			for(int i=0;i<adCarts.size();i++)
			{
				System.out.println("Ad id----"+adCarts.get(i).getAdvertisementId());
				System.out.println("cart id ----"+adCarts.get(i).getCartId());
				String query2 = "delete from adcart where cartId="+adCarts.get(i).getCartId();
				int rowcount=stmt.executeUpdate(query2);
				System.out.println("The ros affected are :"+rowcount);
			}
			r.close();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 		
	}




	public void postAd(String userName, String itemName,
			String itemDescription, int quantity, int itemPrice) {
		System.out.println("Posting the ad !! ");
		String query="insert into advertisement values(null,'"+itemName+"'"+",'"+itemDescription+"',"+itemPrice+","+quantity+",'"+userName+"')";
		try {
			int rowcount=stmt.executeUpdate(query);
			System.out.println(" Done posting the ad ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}




	public void SignUp(String firstName, String lastName, String userName,
			String password, String address, String phone, String email) {
		System.out.println("Persisting the Member for Sign Up!! ");
		Member member=new Member();
		String query="insert into member values(null,'"+firstName+"'"+",'"+lastName+"','"+userName+"','"+password+"','"+address+"','"+phone+"','"+email+"')";
		try {
			int rowcount=stmt.executeUpdate(query);
			System.out.println(" Done Sign Up  ");
			
			String query1 = "select * from member where userName = '" + userName.trim().toLowerCase() + "'";
			ResultSet r = stmt.executeQuery(query1);
			while(r.next()) {
				member.setMemberId(r.getInt("memberId"));
				member.setEmail(r.getString("email"));
				member.setFirstName(r.getString("firstname"));
				member.setLastName(r.getString("lastname"));
				member.setPassword(r.getString("password"));
				member.setAddress(r.getString("address"));
				member.setPhone(r.getString("phone"));
			}
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);
			String query2="insert into login values(null,"+member.getMemberId() +",'"+currentTime+"')";
			int rowcount4=stmt.executeUpdate(query2);
			System.out.println(" The rowcount after the login date in login "+rowcount4);
			r.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
