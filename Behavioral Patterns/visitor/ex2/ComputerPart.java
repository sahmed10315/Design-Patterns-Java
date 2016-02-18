package visitor.ex2;

/* Interface to represent elements, which can be used by the visitor pattern */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}