package dto;

public class AdOrder {
	private int orderId;
	private int userName;
	private int advertisementId;
	private int quantityOrdered;
	private int totalPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
