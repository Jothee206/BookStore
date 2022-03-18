import bookstoreapp.User;
import bookstoreapp.UserValidation;

public class UserValidationTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
User user=new User();
user.setName("jothee");;
user.setEmail("j@gmail.com");
user.setPassword("jothee1234");
user.setMobilenumber("8838663499");
System.out.println(user);
UserValidation.Registrationvalidation(user);
	}
}