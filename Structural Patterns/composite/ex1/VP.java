package composite.ex1; 

/* Leaf class in the tree structure of Composite pattern */
public class VP implements Corporate {
	private String name;
	private String division;

	public VP(String n, String d) {
		name = n;
		division = d;
	}

	public String getName() {
		return name;
	}

	/* Prints the VP */
	public void print() {
		System.out.println("Name: " + name + " Division: " + division);
	}
}