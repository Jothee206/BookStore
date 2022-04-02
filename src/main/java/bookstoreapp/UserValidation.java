package bookstoreapp;

import bookstoreapp.main.User;

public class UserValidation {

	public static void registrationValidation(User user) throws Exception {
		if (user.getName() == null || user.getName().equals(" ") || user.getName().trim().equals("")) {

			throw new Exception("name cannot be null");// raise an problem
		} else if (!user.getEmail().contains("@")) {

			throw new Exception("invalid email");
		} else if (user.getPassword() == null || (user.getPassword().length() < 8)) {

			throw new Exception("invalid password");
		} else if (user.getMobilenumber() == null || user.getMobilenumber().length() != 10) {

			throw new Exception("invalid mobile number");
		}

	}

}
