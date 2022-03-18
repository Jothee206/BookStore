import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.Bookitems;

public class BookitemsDAO {

public static void addBookitems(Bookitems bookitems) throws Exception{
////Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");

 String query="INSERT INTO book_items (book_categories,book_title,author_name,price) VALUES (?,?,?,?)";
 
 PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statemnt and get the values.
	statement.setString(1,bookitems.getBookauthor());
	statement.setString(2,bookitems.getBookcategories());
	statement.setString(3,bookitems.getBooktitle());
	statement.setInt(4,bookitems.getPrice());
	System.out.println(query);

	int row=statement.executeUpdate();
	System.out.println("No of rows inserted:"+row);
	
	statement.close();
connection.close();
}
}
