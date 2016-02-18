package visitor.ex2;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}