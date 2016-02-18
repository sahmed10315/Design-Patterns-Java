package visitor.ex2;

/* Composite Object and an element of ComputerPart, which dispatches its execution to a particular visitor class instance */
public class Computer implements ComputerPart {

	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	/*
	 * Visit all elements of composite and perform the algorithm defined by the
	 * visitor on all objects Then finally visit the current (this) object
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}