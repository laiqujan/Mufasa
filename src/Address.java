
public class Address {
	private String streetAddres;
	private String city;
	private String code;
	private String country;

	public Address(String streetAddres, String city, String code, String country) {
		this.streetAddres = streetAddres;
		this.city = city;
		this.code = code;
		this.country = country;
	}

	public Address() {

	}

	public String getStreetAddres() {
		return streetAddres;
	}

	public void setStreetAddres(String streetAddres) {
		this.streetAddres = streetAddres;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean checkValidity(String data, String testType) {
		if ((testType == "city") & (data.matches("[0-9]+"))) {
			return false;

		} else if ((testType == "code") & (data.matches("A-Z") || data.matches("a-z") || data.matches("@"))) {
			return false;

		} else if ((testType == "country") & (data.matches("[0-9]+"))) {
			return false;
		}
		return true;
	}

}
