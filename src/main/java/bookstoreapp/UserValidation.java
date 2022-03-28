package bookstoreapp;

import bookstoreapp.main.User;

public class UserValidation {

		
		public static void Registrationvalidation(User user) throws Exception {
			if(user.getName()!=null|| user.getName().equals(" ")||user.getName().trim().equals("")) {
			}
			else {
				throw new Exception("name cannot be null");//raise an problem
			}
			if(user.getEmail()!=null||user.getEmail().contains("@")||user.getEmail().contains(".com")||user.getEmail()=="String") {
			}
			else {
				throw new Exception("invalid email");
			}
			 if(user.getPassword() !=null||(user.getPassword().length()>=8) ){
			 }
			 else {
				throw new Exception("invalid password");
			}
			if(user.getMobilenumber() !=null||user.getMobilenumber().length()>=10) {
			}
			else {
				throw new Exception("invalid mobile number");
			}
			
				
			
		}
		
		}
	


