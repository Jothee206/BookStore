package bookstoreapp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookstoreapp.DAO.ConnectionUtil;
//import bookstoreapp.ConnectionUtil;
import bookstoreapp.main.Bookitems;

public class BookitemsView {

	public static List<Bookitems> showAll() throws SQLException, ClassNotFoundException {
		List<Bookitems> books = new ArrayList<Bookitems>();
		Connection connection;
		connection=ConnectionUtil.databaseConnection();
		
		String sql = "select * from book_items";
		
		
		Statement statement = connection.prepareStatement(sql);

		// 3.execute query
		ResultSet rs = statement.executeQuery(sql);

		// iterate rows
		while (rs.next()) {
			Integer id = rs.getInt("id");
			String bookcategories = rs.getString("book_categories");
			String booktitle = rs.getString("book_title");
			String authorname = rs.getString("author_name");
			String price = rs.getString("price");
			// create object for entire items
			Bookitems bookitemsobj = new Bookitems();
			bookitemsobj.setBookcategories(bookcategories);
			bookitemsobj.setBooktitle(booktitle);
			bookitemsobj.setAuthorname(authorname);
			bookitemsobj.setPrice(price);

			// store row details in list
			books.add(bookitemsobj);
		}
		return books;

	}

	public static List<Bookitems> bookcategories(String category) throws Exception {
		List<Bookitems> bookcategory = new ArrayList<Bookitems>();
		Connection connection;
		connection=ConnectionUtil.databaseConnection();
		
		
		String sql = "SELECT id, book_categories,book_title,author_name,price FROM book_items WHERE book_categories=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, category);

		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows

		while (rs1.next()) {

			Integer id = rs1.getInt("id");
			String bookcategories1 = rs1.getString("book_categories");
			String booktitle = rs1.getString("book_title");
			String authorname = rs1.getString("author_name");
			String price = rs1.getString("price");
			Bookitems bookitemsviewobj = new Bookitems();
			bookitemsviewobj.setBookcategories(bookcategories1);
			bookitemsviewobj.setBooktitle(booktitle);
			bookitemsviewobj.setAuthorname(authorname);
			bookitemsviewobj.setPrice(price);

			// store row details in list
			bookcategory.add(bookitemsviewobj);
		}

		return bookcategory;

	}

	public static List authorname(String authorname) throws Exception {
		List<Bookitems> authorname1 = new ArrayList<Bookitems>();

		Connection connection;
		connection=ConnectionUtil.databaseConnection();
		
		String sql = "SELECT id, book_categories,book_title,author_name,price FROM book_items WHERE author_name=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, authorname);

		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows

		while (rs1.next()) {

			Integer id = rs1.getInt("id");
			String bookcategories1 = rs1.getString("book_categories");
			String booktitle = rs1.getString("book_title");
			String authorname11 = rs1.getString("author_name");
			String price = rs1.getString("price");
			Bookitems bookitems = new Bookitems();
			bookitems.setBookcategories(bookcategories1);
			bookitems.setBooktitle(booktitle);
			bookitems.setAuthorname(authorname11);
			bookitems.setPrice(price);

			// store row details in list
			authorname1.add(bookitems);
		}

		return authorname1;

	}
}
