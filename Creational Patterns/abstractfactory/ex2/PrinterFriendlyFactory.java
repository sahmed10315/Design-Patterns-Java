package abstractfactory.ex2;

/* A concrete factory */
public class PrinterFriendlyFactory implements ShapeFactory {
	@Override
	public Shape getShape(String sourceType) {
		switch (sourceType) {
		case "Circle":
			return new PrinterFriendlyCircle(10, 10, 20);
		case "Rectangle":
			return new PrinterFriendlyRectangle(10, 20);
		}
		return null;
	}
}