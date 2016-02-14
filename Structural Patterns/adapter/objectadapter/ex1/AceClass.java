package adapter.objectadapter.ex1;

/* Class which will be adapted, to look like AcmeClass */
public class AceClass implements AceInterface {
	String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}