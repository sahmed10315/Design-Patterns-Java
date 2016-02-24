package decorator.ex1;

/* Subclass the original "Component" into a "Decorator" class
*  In the Decorator class, add a Component pointer as a field;
*/
public abstract class ComponentDecorator implements Computer {

	protected Computer computer;

	public ComponentDecorator(Computer c) {
		this.computer = c;
	}

	public String description() {
		return computer.description();
	}
}
