package visitor.ex2;

public class TestVisitor {
	public static void main(String[] args) { 
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
