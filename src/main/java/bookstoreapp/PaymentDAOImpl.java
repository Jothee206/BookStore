package bookstoreapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PaymentDAOImpl implements IPaymentDAO{
	
public void details(Payment payment) throws Exception {
	Connection connection = null;
	PreparedStatement statement = null;
//apply exception on try catch 
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
				"rev_user");

		String query = "INSERT INTO orderpayment(price,deliverycharges,amountpaid) values (?,?,?)";
				statement = connection.prepareStatement(query);
		statement.setInt(1, payment.getPrice());
		statement.setInt(2, payment.getAmountpaid());
		statement.setInt(3, payment.getAmountpaid());
		int rows = statement.executeUpdate();
		System.out.println(rows);
	} 
	
}


