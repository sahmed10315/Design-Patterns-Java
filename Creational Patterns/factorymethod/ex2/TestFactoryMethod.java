package factorymethod.ex2;

/*
 * Factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects
 * without having to specify the exact class of the object that will be created.
 * According to GOF : "Define an interface for creating an object, but let subclasses decide which class to instantiate. 
 * 					  The Factory method lets a class defer instantiation it uses to subclasses."
 * In JDK they can be recognized by creational methods returning an implementation of an abstract/interface type.
 * Examples: java.util.Calendar#getInstance()
 *			 java.util.ResourceBundle#getBundle()
 *           java.text.NumberFormat#getInstance()
 */
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
