package bookstoreapp;

public class BookitemsValidation {


public static void Validationitems(Bookitems bookitems) throws Exception {
	
	if(bookitems.getBookauthor()==null) {
		throw new Exception("author name cannot be null");//raise an problem
	}
	else if(bookitems.getBookcategories()==null) {
		throw new Exception("categories cannot be null");
	}
	else if(bookitems.getBooktitle() ==null) {
		throw new Exception("invalid titlename");
	}
	else if(bookitems.getPrice() ==0) {
		throw new Exception("price cannot be null");
	}
	System.out.println("validation is successful");
}

}