package composite.ex2;

/** "Composite" */
import java.util.List;
import java.util.ArrayList;

public class CompositeGraphic implements Graphic {

	// Collection of child graphics.
	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	// Prints the graphic.
	public void print() {
		for (Graphic graphic : childGraphics) {
			graphic.print();
		}
	}

	// Adds the graphic to the composition.
	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	// Removes the graphic from the composition.
	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
}