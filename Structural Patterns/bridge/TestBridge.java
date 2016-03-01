package bridge;

/* Bridge pattern is used when we have an abstraction that can vary, and its tied to an implementation that can also vary. The class itself can 
 * be thought of as an abstraction and what it can do is implementation. The idea of bridge pattern is to decouple the two with the use of composition.
 * 
 * According to GOF: Decouple an abstraction from its implementation so that the two cary vary independently.
 *  
 * In JDK they are recognizable by creational methods taking an instance of different abstract/interface type and returning an implementation 
 * of own abstract/interface type which delegates/uses the given instance)
 */
public class TestBridge {
	public static void main(String[] args) {
		// The shapes and the drawing API are decoupled, and can be used independently. 
		Shape[] shapes = new Shape[] { new CircleShape(1, 2, 3, new DrawingAPI1()),
				new CircleShape(5, 7, 11, new DrawingAPI2()) };

		for (Shape shape : shapes) {
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}
}
