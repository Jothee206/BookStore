package bookstoreapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bookstoreapp.DAO.IUserLoginDAO;
import bookstoreapp.main.UserLogin;

public class UserLoginDAOImpl implements IUserLoginDAO {
	public void Login(UserLogin userLogin) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
				"rev_user");
	//insert the query
String query = "select email,password from bookstore_app where email=? ";

PreparedStatement  statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statemnt and get the values.

statement.setString(1,userLogin.getEmail());


String mail=null;
String password=null;


ResultSet set=statement.executeQuery();
while(set.next()) {

mail=set.getString("email");
password=set.getString("password");

}
if(mail==null) {
	throw new Exception("Invalid user");
}
else if(userLogin.getUserPassword().equals(password)) {
	System.out.println("Logging in successfully");
}
else {
	throw new Exception("Invalid Credentials");
}




statement.close();
connection.close();



}

	public void Login(bookstoreapp.DAO.UserLogin userlogin) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	}

	
	

	
	

	
	


