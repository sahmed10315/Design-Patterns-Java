package factorymethod.ex2;

/* All the objects which the factory creates must be derived from this interface */
public interface Shape {
	public void draw();
	public void fillColor();
}