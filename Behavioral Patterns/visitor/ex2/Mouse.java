package visitor.ex2;

/* An element of ComputerPart, which dispatches its execution to a particular visitor class instance */
public class Mouse implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}