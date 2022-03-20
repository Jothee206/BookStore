package bookstoreapp;

public class Payment {

	private int price;
	private int deliverycharges;
	private int amountpaid;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		 this.price = price;
	}
	public int getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(int deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	public int getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(int amountpaid) {
		this.amountpaid = amountpaid;
	}

public String toString() {
	return "payment[price=" + price + ", deliverycharges=" + deliverycharges + ", amountpaid="  +amountpaid+"]";

			
}
}