package dto;

public class AdCart {
private int cartId;
private int userName;
private int advertisementId;
private int quantityOrdered;
private int totalPrice;
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getUserName() {
	return userName;
}
public void setUserName(int userName) {
	this.userName = userName;
}
public int getAdvertisementId() {
	return advertisementId;
}
public void setAdvertisementId(int advertisementId) {
	this.advertisementId = advertisementId;
}
public int getQuantityOrdered() {
	return quantityOrdered;
}
public void setQuantityOrdered(int quantityOrdered) {
	this.quantityOrdered = quantityOrdered;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

}
