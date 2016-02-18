package visitor.ex1;

/* An element of ICarElement, which dispatches its execution to a particular visitor class instance */
public class Body implements ICarElement {
	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}
}