package bookstoreapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookitemsOrderDAOImpl implements IBookitemsOrderDAO{

public void addBookitemsorder(BookitemsOrder bookitemsorder) throws Exception {
		// TODO Auto-generated method stub
	Connection connection = null;
	PreparedStatement statement = null;
	
	//database driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//get the connection
	connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
			"rev_user");
	//insert query
	String query ="Insert into Bookitemsorder(bookname,customername,address,contactnumber,city,price,totalamount) values (?,?,?,?,?,?,?)";
	statement = connection.prepareStatement(query);
	statement.setString(1, bookitemsorder.getBookname());
	statement.setString(2,bookitemsorder.getAddress());
	statement.setString(3, bookitemsorder.getAddress());
	statement.setString(4, bookitemsorder.getContactNumber());
	statement.setString(5, bookitemsorder.getCity());
	statement.setInt(6, bookitemsorder.getPrice());
	statement.setInt(7, bookitemsorder.getTotalAmount());
	
	//execute query
	System.out.println(query);

	int row=statement.executeUpdate();
	System.out.println("No of rows inserted:"+row);
	
	statement.close();
connection.close();
}
}


