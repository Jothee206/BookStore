import bookstoreapp.BookitemsOrder;

public class BookitemsOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BookitemsOrder bookitemsorder = new BookitemsOrder();
 bookitemsorder.setCustomername("name");
 bookitemsorder.setContactNumber("number");
 bookitemsorder.setAddress("address");
 bookitemsorder.setCity("city");
 bookitemsorder.setAddress("harrypotter");
 bookitemsorder.setPrice(600);
 bookitemsorder.setTotalAmount(600);
	
 System.out.println(bookitemsorder);
	}
}
