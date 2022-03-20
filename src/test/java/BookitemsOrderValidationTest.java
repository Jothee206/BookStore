import bookstoreapp.BookitemsOrder;
import bookstoreapp.BookitemsOrderValidation;

public class BookitemsOrderValidationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	BookitemsOrder bookitemsorder = new BookitemsOrder();
	bookitemsorder.setCustomername("jo");
	bookitemsorder.setAddress("cpt");
	bookitemsorder.setBookname("harrypotter");
	bookitemsorder.setCity("chennai");
	bookitemsorder.setContactNumber("9876543284");
	bookitemsorder.setPrice(700);
	bookitemsorder.setTotalAmount(700);
	
System.out.println(bookitemsorder);
BookitemsOrderValidation.Validationbookitemsorder(bookitemsorder);
}
}