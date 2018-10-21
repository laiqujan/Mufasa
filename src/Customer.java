public class Customer {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String username;
	private String password;
	private String verifyPassword;
	private String country;
	private String brithday;
	private String emailAddress;

	public Customer(String firstName, String lastName, String contactNumber, String username, String password,
			String verifyPassword, String country, String brithday, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.username = username;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.country = country;
		this.brithday = brithday;
		this.emailAddress = emailAddress;
	}

	public Customer() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBrithday() {
		return brithday;
	}

	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean checkValidity(String data, String testType) {
		if ((testType == "username") & (data.length() > 15 || data.matches("__") || data.isEmpty())) {
			return false;

		} else if ((testType == "password") & (data.length() < 8)) {
			return false;

		} else if ((testType == "contact") & (!data.matches("[0-9]+"))) {
			return false;

		} else if ((testType == "email") & (!(data.matches(".com")) || (!(data.matches("@"))))) {
			return false;

		}
		return true;
	}

}
