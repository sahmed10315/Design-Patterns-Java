package pattern.creational.factorymethod.ex2;

public class TestFactoryMethod {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle");
		canvas.addNewShape("Rectangle"); 
		canvas.addNewShape("Rectangle"); 
		canvas.addNewShape("Rectangle"); 
		canvas.addNewShape("Rectangle");
		canvas.redraw();
	}
}
