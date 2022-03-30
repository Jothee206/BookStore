package bookstoreapp.main;

public class BookitemsOrder {
	private String booktitle;
	private String authorname;
	private String price;
	
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle= booktitle;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String toString() {
		return "bookitemsorder [booktitle=" +booktitle + ", authorname=" + authorname + ", price=" + price + "]";
				
	}

}
