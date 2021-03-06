package bookstoreapp.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bookstoreapp.UserValidation;
import bookstoreapp.main.User;
import bookstoreappDAO.UserDAO;

public class UserTest {

	public static void main(String[] args) throws Exception {
		items();
	}

	public static void items() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hii");
		System.out.println("welcome to bokmart");

		/*
		 * System.out.println("\t\tList the bookitems"); BookitemsViewTest.items();
		 * System.out.println("\t\t\t\t\t\t");
		 */
		System.out.println("\t\t go to registration page");

		System.out.println("enter the username");
		String name = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		System.out.println("enter mobilenumber");
		String mobilenumber = sc.next();

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setMobilenumber(mobilenumber);

		int count = 0;
		try {
			UserValidation.registrationValidation(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("invalid registration");
			UserTest.items();
		}
		if (count == 0) {

			System.out.println("registration successful");
			UserDAO.addBookstore1(user);

			System.out.println("\t\t\t\t\t\t");

			System.out.println("\t\tGo to login page");
			UserLoginTest.items();

			System.out.println("\t\tList the bookitems");
			BookitemsViewTest.items();

			System.out.println("\t\tDisplay by categories");
			BookitemsViewTest.items1();
			BookitemsViewTest.items2();

			System.out.println("\t\t order the book");
			BookitemsOrderTest.items();

			// System.out.println("update the order");
			// UpdateBookitemsOrderTest.items();

			System.out.println("\t\t Enter customer details");
			CustomerDetailsTest.items();

			System.out.println("\t\tDisplay the payment details");
			PaymentTest.items();

			System.out.println("\t\tyour order is completed");
			System.out.println("soon you will receive the order");
			System.out.println("\t\tThank you");
		}
	}

}