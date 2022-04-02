package bookstoreapp.main;

public class UpdateBookitemsOrder {

	private String price;
	private String booktitle;

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

	public String toString() {
		return "UpdatebookitemsOrder [price=" + price + ", booktitle=" + booktitle + "]";

	}

}
