
package bookstoreapp.test;
import bookstoreapp.DAO.BookitemsOrderDAOImpl;
import bookstoreapp.main.BookitemsOrder;
import java.util.Scanner;

public class BookitemsOrderTest {

	public static void main(String[] args) throws Exception {
		items();
	}
	public static void items() throws Exception{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer_Name");
		String Customer_Name=sc.next();
		System.out.println("enter contact_number");
		String number=sc.next();
		System.out.println("enter address");
        String address=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter price");
		String price=sc.next();
		System.out.println("enter booktitle");
		String booktitle=sc.next();
		System.out.println("enter totalamount");
		String totalAmount=sc.next();
		System.out.println(booktitle);
				
		// TODO Auto-generated method stub
 BookitemsOrder bookitemsorder = new BookitemsOrder();
 bookitemsorder.setCustomer_Name(Customer_Name);
 bookitemsorder.setContact_number(number);
 bookitemsorder.setAddress(address);
 bookitemsorder.setCity(city);
 bookitemsorder.setPrice(price);
 bookitemsorder.setBooktitle(booktitle);
 bookitemsorder.setTotalAmount(totalAmount);

	
	
	System.out.println("validation successful");
	BookitemsOrderDAOImpl.addorder(bookitemsorder);
	
	
		
}
}