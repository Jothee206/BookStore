package bookstoreapp.main;

import java.util.List;

public class Bookitems {

	


	private String bookcategories;
	private String booktitle;
	private String authorname;
	private String price ;
	public String getBookcategories() {
		return bookcategories;
	}
	 public void setBookcategories(String bookcategories) {
		this.bookcategories = bookcategories;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
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
	public void setPrice(String  price) {
		this.price = price;
	}
	public String toString() {
		return "items[bookcategories=" + bookcategories + ", booktitle=" + booktitle + ", authorname=" + authorname +", price="
				+ price+"]";
	}
	public static List<Bookitems> showAll() {
		return null;
		// TODO Auto-generated method stub
		
	
	
	
	}
	
	}
	 
	
