package bookstoreapp.main;

public class User {

	public static void items() throws Exception {
		items();
	}

	private String name;
	private String email;
	private String password;
	private String mobilenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobileNumber) {
		this.mobilenumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "User [userName=" + name + ", password=" + password + ", email=" + email + ", mobileNumber="
				+ mobilenumber + "]";
	}

}