package observer.ex2;
/* The observer pattern is a software design pattern in which an object, called the subject, maintains a 
 * list of its dependents, called observers, and notifies them automatically of any state changes, usually 
 * by calling one of their methods. 
 * 
 * This method follows OOP principle of loose coupling.
 * 
 * In jdk this pattern is used by using listeners that listen for user interface events.
 * java.util.Observer/java.util.Observable (rarely used in real world though)
 * All implementations of java.util.EventListener (practically all over Swing thus)
 * 
 * Reference : Effective Java Item 67
 * */
public class TestObserver {
	public static void main(String[] s) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.setCanvas(new Canvas());
		circle.setShapeArchiver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);
	}
}