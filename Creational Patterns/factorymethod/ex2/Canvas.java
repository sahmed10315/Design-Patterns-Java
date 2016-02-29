package factorymethod.ex2;

import java.util.ArrayList;
import java.util.Iterator;

/* Utility class used to hold a collection of shapes. All the shapes are added in the collection through the factory method */
public class Canvas {

	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	public void addNewShape(String shapeType) {
		Shape shape = ShapeFactory.getShape(shapeType);
		shapeList.add(shape);
	}

	public void redraw() {
		Iterator<Shape> itr = shapeList.iterator();
		while (itr.hasNext()) {
			Shape shape = itr.next();
			shape.draw();
		}
	}
}
