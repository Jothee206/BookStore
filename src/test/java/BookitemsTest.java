import bookstoreapp.Bookitems;

public class BookitemsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Bookitems bookitems=new Bookitems();
	bookitems.setBookcategories("categories");
	bookitems.setBookauthor("names");
	bookitems.setBooktitle("titles");
	bookitems.setPrice(400);

	System.out.println(bookitems);
}
	
}