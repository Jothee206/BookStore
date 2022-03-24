
package bookstoreapp.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import bookstoreapp.IBookitemsOrderDAO;
import bookstoreapp.main.BookitemsOrder;

public class BookitemsOrderDAOImpl implements IBookitemsOrderDAO{

public static void addorder(BookitemsOrder bookitemsorder) throws Exception {
		// TODO Auto-generated method stub
	Connection connection = null;
	PreparedStatement statement = null;
	
	
	try{
		//database driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//get the connection
	connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
			"rev_user");
	//insert query
	String query ="INSERT INTO bookitems_order(customer_Name,contact_Number,address,city,price,booktitle,total_amount) VALUES (?,?,?,?,?,?,?)";
	statement = connection.prepareStatement(query);
	statement.setString(1, bookitemsorder.getCustomer_Name());
	statement.setString(2,bookitemsorder.getContact_number());
	statement.setString(3, bookitemsorder.getAddress());
	statement.setString(4, bookitemsorder.getCity());
	statement.setString(5, bookitemsorder.getPrice());
	statement.setString(6, bookitemsorder.getBooktitle());
	statement.setString(7, bookitemsorder.getTotalAmount());
	
	//execute query
	System.out.println(query);

	int row=statement.executeUpdate();
	System.out.println("No of rows inserted:"+row);
} catch (ClassNotFoundException e) {

	e.printStackTrace();
	throw new Exception(e.getMessage(), e);

} finally {
	if (statement != null) {
		statement.close();
	}
	if (connection != null) {
		connection.close();
	}

}

	
	statement.close();
connection.close();
}



public void addBookitemsorder(BookitemsOrder bookitemsorder) throws Exception {
	// TODO Auto-generated method stub
	
}


}


