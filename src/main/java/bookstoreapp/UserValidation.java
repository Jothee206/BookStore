package bookstoreapp;

public class UserValidation {

		
		public static void Registrationvalidation(User user) throws Exception {
			if(user.getName()==null|| user.getName().equals(" ")||user.getName().trim().equals("")) {
				throw new Exception("name cannot be null");//raise an problem
			}
			else if(user.getEmail()==null) {
				throw new Exception("invalid email");
			}
			else if(user.getPassword() ==null) {
				throw new Exception("invalid password");
			}
			else if(user.getMobilenumber() ==null) {
				throw new Exception("invalid mobile number");
			}
			System.out.println("validation is successful");
		}
		
		}
	


