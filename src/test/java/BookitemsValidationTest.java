import bookstoreapp.Bookitems;
import bookstoreapp.BookitemsValidation;
import bookstoreapp.User;
import bookstoreapp.UserValidation;

public class BookitemsValidationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Bookitems bookitems=new Bookitems();
		bookitems.setBookauthor("authorname");
	    bookitems.setBookcategories("categories");
		bookitems.setBooktitle("titlename");
		bookitems.setPrice(400);
		
		System.out.println(bookitems);
				
		BookitemsValidation.Validationitems(bookitems);
			}
		}
	


