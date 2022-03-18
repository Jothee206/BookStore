import bookstoreapp.Bookitems;

public class BookitemsDAOTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	Bookitems bookitems = new Bookitems();
	bookitems.setBookcategories("categories");
	bookitems.setBookauthor("authors");
	bookitems.setBooktitle("titlename");
	bookitems.setPrice(400);
	
	System.out.println(bookitems);
			
	BookitemsDAO bookitemsDAO = new BookitemsDAO();
	bookitemsDAO.addBookitems(bookitems);

}
}