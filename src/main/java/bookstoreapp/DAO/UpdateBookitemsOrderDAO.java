package bookstoreapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstoreapp.main.BookitemsOrder;
import bookstoreapp.main.UpdateBookitemsOrder;

public class UpdateBookitemsOrderDAO
{
	public static void updateBookOrder(UpdateBookitemsOrder updatebookitemsorder)throws Exception  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		
	String query="UPDATE bokitems_order SET price=? WHERE book_title=?";
	
	PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
	   
	    statement.setString(1,updatebookitemsorder.getPrice());
		statement.setString(2,updatebookitemsorder.getBooktitle());
		
		
		
		System.out.println();
		int row=statement.executeUpdate();
		System.out.println();
		
		statement.close();
	connection.close();
	}
}

