import bookstoreapp.Bookitems;

public class BookitemsDAOTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	Bookitems bookitems = new Bookitems();
	bookitems.setBookcategories("storybooks");
	bookitems.setBookauthor("j.k.rowling");
	bookitems.setBooktitle("harrypotter");
	bookitems.setPrice(400);
	
	System.out.println(bookitems);
			
	 BookitemsDAOImpl BookitemsDAOImpl = new BookitemsDAOImpl();
	 BookitemsDAOImpl.addBookitems(bookitems);

}
}