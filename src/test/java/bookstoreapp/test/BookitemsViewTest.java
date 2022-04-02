package bookstoreapp.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import bookstoreapp.main.Bookitems;
import bookstoreapp.main.BookitemsOrder;
import bookstoreapp.main.BookitemsView;

import java.util.ArrayList;

public class BookitemsViewTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		items1();
		items2();// creating an method to call in main class
	}

	public static void items() throws Exception {
		List<Bookitems> book = new ArrayList<Bookitems>();
		book = BookitemsView.showAll();
		showAll(book);
	}

	public static void items1() throws Exception {
		System.out.println("Enter the category:");
		String category = sc.next();

		List<Bookitems> bookcategory = new ArrayList<Bookitems>();
		bookcategory = BookitemsView.bookcategories(category);
		showAll(bookcategory);
	}

	public static void items2() throws Exception {
		System.out.println("Enter the authorname:");
		String authorname = sc.next();

		List<Bookitems> authorname1 = new ArrayList<Bookitems>();
		authorname1 = BookitemsView.authorname(authorname);
		showAll(authorname1);
	}

	public static void showAll(List<Bookitems> book) {
		System.out.println("Bookcategories         Booktitle            Authorname          Price");

		for (Bookitems i : book) {
			System.out.println(i.getBookcategories() + "\t\t" + i.getBooktitle() + "\t\t" + i.getAuthorname() + "\t\t"
					+ i.getPrice());
		}
	}

	public static void categories(List<Bookitems> bookcategory) {
		for (Bookitems i : bookcategory) {
			System.out.println(i.getBookcategories());
		}
	}

	public static void authorname(List<Bookitems> authorname1) {
		for (Bookitems i : authorname1) {
			System.out.println(i.getAuthorname());
		}

	}
}
