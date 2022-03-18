

import bookstoreapp.User;

import bookstoreappDAO.UserDAO;

public class UserDAOTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("jothee");
		user.setPassword("pass1234");
		user.setEmail("j@gmail.com");
		user.setMobilenumber("8838663499");
		
		System.out.println(user);
		
		UserDAO userdAO=new UserDAO();
		userdAO.addBookstore1(user);
	}

}
