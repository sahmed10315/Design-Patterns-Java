package visitor.ex1;

/* Composite Object and an element of ICarElement, which dispatches its execution to a particular visitor class instance */
public class Car implements ICarElement {
	ICarElement[] elements;

	public Car() {
		this.elements = new ICarElement[] { new Wheel("front left"), new Wheel("front right"), new Wheel("back left"),
				new Wheel("back right"), new Body(), new Engine() };
	}

	/*
	 * Visit all elements of composite and perform the algorithm defined by the
	 * visitor on all objects Then finally visit the current (this) object
	 */
	public void accept(ICarElementVisitor visitor) {
		for (ICarElement elem : elements) {
			elem.accept(visitor);
		}
		visitor.visit(this);
	}
}