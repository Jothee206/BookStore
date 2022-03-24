package bookstoreapp.DAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.DAO.IPaymentDAO;
import bookstoreapp.main.Payment;

public class PaymentDAOImpl implements IPaymentDAO{
	public void details(Payment payment) throws Exception {

	Connection connection = null;
	PreparedStatement statement = null;
//apply exception on try catch 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
				"rev_user");

		String query = "INSERT INTO order_payment(price,delivery_charges,amount_paid) values (?,?,?)";
				statement = connection.prepareStatement(query);
		statement.setInt(1, payment.getPrice());
		statement.setInt(2, payment.getDeliverycharges());
		statement.setInt(3, payment.getAmountpaid());
		int rows = statement.executeUpdate();
		System.out.println(rows);
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
	

	

	

	}}

 
	

	



