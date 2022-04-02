package bookstoreapp.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bookstoreapp.DAO.UpdateBookitemsOrderDAO;
import bookstoreapp.main.Bookitems;
import bookstoreapp.main.BookitemsView;
import bookstoreapp.main.UpdateBookitemsOrder;

public class UpdateBookitemsOrderTest {

	public static void main(String[] args) throws Exception {
		items();
	}

	public static void items() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter price");
		String price = sc.next();
		System.out.println("enter booktitle");
		String booktitle = sc.next();

		UpdateBookitemsOrder updatebookitemsorder = new UpdateBookitemsOrder();
		updatebookitemsorder.getPrice();
		updatebookitemsorder.getBooktitle();
		try {
			UpdateBookitemsOrderDAO.updateBookOrder(updatebookitemsorder);

		} catch (Exception e) {

			UpdateBookitemsOrderDAO.updateBookOrder(updatebookitemsorder);
			System.out.println("Your Order is Updated successfully..\n");

			System.out.println(e.getMessage());
			// System.out.println("Your Order is Updated successfully..\n");

		}
	}
}
