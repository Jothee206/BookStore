import bookstoreapp.BookitemsOrder;
import bookstoreapp.BookitemsOrderDAOImpl;

public class BookitemsOrderDAOImplTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BookitemsOrder bookitemsorder = new BookitemsOrder();
bookitemsorder.setBookname("harrypotter");
bookitemsorder.setCustomername("raj");
bookitemsorder.setContactNumber("9042984964");
bookitemsorder.setCity("chennai");
bookitemsorder.setAddress("gstRoad");
bookitemsorder.setPrice(600);
bookitemsorder.setTotalAmount(600);

	


  BookitemsOrderDAOImpl bookitemsorderDAOImpl = new BookitemsOrderDAOImpl();
  
  bookitemsorderDAOImpl.addBookitemsorder(bookitemsorder);
}
}