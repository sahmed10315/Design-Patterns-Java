package visitor.ex1;

/* Represent an operation to be performed on the elements of an object structure(composite). 
 * Visitor lets a new operation be defined without changing the classes of the elements on which it operates.
 * 
 * In JDK they  are recognizable by two different abstract/interface types which has methods definied which 
 * takes each the other abstract/interface type; the one actually calls the method of the other and the other 
 * executes the desired strategy on it
 * 
 * JDK examples: java.nio.file.FileVisitor and SimpleFileVisitor
 * */
public class TestVisitor {
	public static void main(String[] args) {
		ICarElement car = new Car();
		// execution algorithm of element vary as and when visitor varies
		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}