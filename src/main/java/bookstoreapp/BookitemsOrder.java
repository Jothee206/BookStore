package bookstoreapp;

public class BookitemsOrder {
	private String customername;
	private String contactNumber;
	private String address;
	private String city;
	private int price;
	private String bookname;
	private int totalAmount;
	

	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String  contactNumber) {
		this.contactNumber = contactNumber;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String items) {
		this.bookname = bookname;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
public String toString() {
	 return "order[customerName="+customername+",contactNumber="+contactNumber+",address="+address+",city="+city+",price="+price+",+bookname="+bookname+",totalAmount="+totalAmount+"]";
}
}
		