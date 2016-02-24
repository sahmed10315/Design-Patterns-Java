package observer.ex2;

/* Subject class Circle does not know about the concrete observer classes and can be changed independently.
 * Circle class "informs" (i.e., "notifies") Canvas and ShapeArchiver whenever it gets "changed"
 * by calling the update method of these two classes
 */
import java.util.Observable;

public class Circle extends Observable {
	private Point center;
	private int radius;

	public void setCenter(Point center) {
		this.center = center;
		setChanged();
		notifyObservers();
	}

	public void setRadius(int radius) {
		this.radius = radius;
		setChanged();
		notifyObservers();
	}

	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}

	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}
}