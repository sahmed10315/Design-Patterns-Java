 package abstractfactory.ex2;

 /* Abstract specification for implementing an actual object factory */
public interface ShapeFactory {
	 public Shape getShape(String sourceType);
}
