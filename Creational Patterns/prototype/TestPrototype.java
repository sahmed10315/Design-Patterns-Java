package prototype;

/*
 * The prototype pattern is used to:
 * 1) Avoid subclasses of an object creator in the client application, like the abstract factory pattern does.
 * 2) Avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) 
 *    when it is prohibitively expensive for a given application.
 */
public class TestPrototype {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}