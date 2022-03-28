
package bookstoreapp.test;
import java.util.Scanner;
import bookstoreapp.UserLoginDAOImpl;
import bookstoreapp.main.UserLogin;
import bookstoreappDAO.UserDAO;

public class UserLoginTest {

	public static void main(String[] args) throws Exception {
		items();
	}
	public static void items() throws Exception{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  
		   System.out.println("enter email");
		   String email=sc.next();
		   System.out.println("enter userPassword");
		   String userPassword=sc.next();

		   UserLogin userlogin= new UserLogin();
		   userlogin.setEmail(email);
	       userlogin.setUserPassword(userPassword);

	      // UserLoginDAOImpl userloginDaoImpl=new UserLoginDAOImpl();
	       try {
	       UserLoginDAOImpl userLoginDAOImpl = new UserLoginDAOImpl();
		userLoginDAOImpl.Login(userlogin);
	       }
	       catch(Exception e) {
	    	   System.out.println(e.getMessage());
	    	   e.printStackTrace();
	    	   UserLoginTest.items();
	       }
	}
}
