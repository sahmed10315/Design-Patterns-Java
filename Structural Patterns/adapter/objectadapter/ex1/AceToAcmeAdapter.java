package adapter.objectadapter.ex1;

/* Adapter class using object composition and delegation. 
 * Reference : https://en.wikipedia.org/wiki/Delegation_pattern */
public class AceToAcmeAdapter implements AcmeInterface {
	AceClass aceObject;
	String firstName;
	String lastName;

	// Delegation to aceobject
	public AceToAcmeAdapter(AceClass a) {
		aceObject = a;
		firstName = aceObject.getName().split(" ")[0];
		lastName = aceObject.getName().split(" ")[1];
	}

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