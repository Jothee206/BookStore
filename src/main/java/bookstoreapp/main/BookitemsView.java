package bookstoreapp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookstoreapp.main.Bookitems;

public class BookitemsView {

	public static List<Bookitems> showAll() throws SQLException, ClassNotFoundException {
		List<Bookitems> books = new ArrayList<Bookitems>();
		String sql = "select * from book_items";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
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

	public static List<Bookitems> bookcategories(String category) throws SQLException, ClassNotFoundException {
		List<Bookitems> bookcategory = new ArrayList<Bookitems>();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
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

	
	
}