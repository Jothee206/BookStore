package bookstoreapp.main;

public class UserLogin {

	private String email;
	private String userPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String toString() {
		return "Userlogin[email=" + email + ", userPassword=" + userPassword + "]";
	}
}
