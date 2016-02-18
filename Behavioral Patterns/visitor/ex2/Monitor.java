package visitor.ex2;

public class Monitor implements ComputerPart { 
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}