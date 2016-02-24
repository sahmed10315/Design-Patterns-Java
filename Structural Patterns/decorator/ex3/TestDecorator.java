package decorator.ex3;

/* Decorator pattern attaches additional responsibilities to an object dynamically. They are a flexible alternative to subclassing for extending functionality.
 * When we use wrapper objects to extend our core functionality and dont need to modify that core functionality we are using the decorator pattern.
 * This pattern utilizes the design principle of SRP.
 * 
 * In JDK they are recognizable by creational methods taking an instance of same abstract/interface type which adds additional behavior)
 * 
 * Reference: Effective Java, Item 16
 * 
 * JDK Examples: All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.
 *               java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
 */
public class TestDecorator {
	public static void main(String[] args) {
		// Create a decorated Window with horizontal and vertical scrollbars
		Window decoratedWindow = new HorizontalScrollBar(new VerticalScrollBar(new SimpleWindow()));

		// Print the Window's description
		System.out.println(decoratedWindow.getDescription());
	}
}