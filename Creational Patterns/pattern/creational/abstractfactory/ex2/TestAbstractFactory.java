package pattern.creational.abstractfactory.ex2;

public class TestAbstractFactory {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle", "DisplayFriendly");
		canvas.addNewShape("Rectangle", "DisplayFriendly");
		canvas.redraw();
	}
}