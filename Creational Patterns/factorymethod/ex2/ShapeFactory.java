package factorymethod.ex2;

/* This class hides the object creation process from the client and supply the objects without specifying the exact class of object that will be created */
public class ShapeFactory {
	/*
	 * This method improves the new operator by giving us the flexibility to
	 * create new objects by our own code
	 */
	public static Shape getShape(String sourceType) {
		switch (sourceType) {
		case "Circle":
			return new Circle(10, 10, 20);
		case "Rectangle":
			return new Rectangle(10, 20);
		}
		return null;
	}
}