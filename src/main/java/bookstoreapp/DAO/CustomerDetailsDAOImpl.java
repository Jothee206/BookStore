
package bookstoreapp.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.main.CustomerDetails;

public class CustomerDetailsDAOImpl implements ICustomerDetailsDAO{

public static void adddetails(CustomerDetails customerdetails ) throws Exception {
		// TODO Auto-generated method stub
	Connection connection = null;
	PreparedStatement statement = null;
	
	
	try{
		//database driver
		connection=ConnectionUtil.databaseConnection();
	//insert query
	String query ="INSERT INTO customer_details(customer_Name,contact_Number,address,city,price,booktitle,total_amount) VALUES (?,?,?,?,?,?,?)";
	statement = connection.prepareStatement(query);
	statement.setString(1, customerdetails.getCustomer_Name());
	statement.setString(2,customerdetails.getContact_number());
	statement.setString(3, customerdetails.getAddress());
	statement.setString(4, customerdetails.getCity());
	statement.setString(5, customerdetails.getPrice());
	statement.setString(6, customerdetails.getBooktitle());
	statement.setString(7, customerdetails.getTotalAmount());
	
	//execute query
	System.out.println(query);

	int row=statement.executeUpdate();
	System.out.println("No of rows inserted:"+row);
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

public void addBookitemsorder(CustomerDetails customerdetails) throws Exception {
	// TODO Auto-generated method stub
	
}}
















