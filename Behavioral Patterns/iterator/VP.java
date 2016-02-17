package iterator;

/* VP objects which will be aggregated into a collection in the Division class */
public class VP {

	private String name;
	private String division;

	public VP(String name, String division) {
		this.name = name;
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Name: " + name + " Division: " + division);
	}
}
