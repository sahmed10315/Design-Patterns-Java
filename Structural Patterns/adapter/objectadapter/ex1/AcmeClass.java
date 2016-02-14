package adapter.objectadapter.ex1;

/* Class which will be adapted */
public class AcmeClass implements AcmeInterface {
	String firstName;
	String lastName;

	public void setFirstName(String f) {
		firstName = f;
	}

	public void setLastName(String l) {
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}