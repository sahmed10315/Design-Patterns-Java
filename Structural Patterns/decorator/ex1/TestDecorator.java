package decorator.ex1;

public class TestDecorator {
	public static void main(String args[]) {

		Computer computer = new CD(new CD(new Monitor(new Disk(new SimpleComputer()))));
		System.out.println("You're getting a " + computer.description() + ".");
	}
}