package visitor.ex2;

/* By implementing this interface we can add new operations to existing object structures without modifying those structures */
public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}