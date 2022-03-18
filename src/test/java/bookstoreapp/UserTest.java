package bookstoreapp;


import bookstoreappDAO.UserDAO;

public class UserTest {

	

	

	public static void main(String[] args) throws Exception {
	
	
		User user=new User();
		user.setName("jothee");
		user.setPassword("pass1234");
		user.setEmail("j@gmail.com");
		user.setMobilenumber("8838663499");
		
		System.out.println(user);
		
	

UserDAO userDAO = new UserDAO();

userDAO.addBookstore1(user);
}
}
