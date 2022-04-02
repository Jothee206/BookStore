package bookstoreapp.test;

import java.util.Scanner;

import bookstoreapp.DAO.BookitemsOrderDAOImpl;
import bookstoreapp.main.BookitemsOrder;

public class BookitemsOrderTest {

	public static void main(String[] args) throws Exception {
		items();
	}

	public static void items() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter booktitle");
		String booktitle = sc.next();
		System.out.println("enter authorname");
		String authorname = sc.next();
		System.out.println("enter price");
		String price = sc.next();

		BookitemsOrder bookitemsorder = new BookitemsOrder();
		bookitemsorder.setBooktitle(booktitle);
		bookitemsorder.setAuthorname(authorname);
		bookitemsorder.setPrice(price);

		try {
			BookitemsOrderDAOImpl.addbookitemsorder(bookitemsorder);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}
}
