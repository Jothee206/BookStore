package bookstoreapp.main;

public class BookitemsOrder {
	private String Customer_Name;
	private String contact_number;
	private String address;
	private String city;
	private String price;
	private String booktitle;
	private String totalAmount;
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String toString() {
		return " [Customer_name=" +Customer_Name + ", Contact_number=" + contact_number + ", address=" + address + ", city="+city+",price="+price+",booktitle="+booktitle+",totalAmount="+totalAmount+"]";
				
	}
	
}
		