package bookstoreapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.main.BookitemsOrder;

public class BookitemsOrderDAOImpl implements IBookitemsOrder {

	public static void addbookitemsorder(BookitemsOrder bookitemsorder) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement statement = null;
		connection=ConnectionUtil.databaseConnection();
		String query = "INSERT INTO bookitems_order(book_title,author_name,price) VALUES (?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, bookitemsorder.getBooktitle());
		statement.setString(2, bookitemsorder.getAuthorname());
		statement.setString(3, bookitemsorder.getPrice());

		// execute query
		System.out.println(query);

		int row = statement.executeUpdate();
		System.out.println("No of rows inserted:" + row);

		statement.close();
		connection.close();

	}

	public void addBookitemsorder(BookitemsOrder bookitemsorder) throws Exception {
		// TODO Auto-generated method stub

	}

}