package bookstoreappDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.main.User;

public class UpdateUserDAO {

	// TODO Auto-generated method stub
	public static void addBookstore1(User user) throws Exception {
		//// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");

		String query = "Update bookstore_app (NAME,email,PASSWORD,mobile_number) VALUES(?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(query);// purpose-if we use concatenation method in
																			// statement space occupied more so use
																			// prepared statemnt and get the values.
		statement.setString(1, user.getName());
		statement.setString(2, user.getEmail());
		statement.setString(3, user.getPassword());
		statement.setString(4, user.getMobilenumber());

		System.out.println(query);

		int row = statement.executeUpdate();
		System.out.println("No of rows inserted:" + row);

		statement.close();
		connection.close();
	}

}
