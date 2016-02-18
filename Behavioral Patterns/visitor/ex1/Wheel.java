package visitor.ex1;

/* An element of ICarElement, which dispatches its execution to a particular visitor class instance */
public class Wheel implements ICarElement {
	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}
}