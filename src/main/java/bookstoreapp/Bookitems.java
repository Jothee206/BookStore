package bookstoreapp;

public class Bookitems {


private String bookcategories;
private String booktitle;
private String bookauthor;
private int price;
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
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString() {
	return "items[bookcategories=" + bookcategories + ", booktitle=" + booktitle + ", bookauthor=" + bookauthor +", price="
			+ price+"]";
}

}

