package bridge;

/** "Abstraction" */
public abstract class Shape {
	protected DrawingAPI drawingAPI; // We use "has a" relationship to
										// encapsulate what kind of DrawingAPI
										// we dealing with. This "has a"
										// relationship
										// is the bridge between the Shape and
										// drawingAPI interface

	protected Shape(DrawingAPI drawingAPI) {
		this.drawingAPI = drawingAPI;
	}

	public abstract void draw(); // low-level

	public abstract void resizeByPercentage(double pct); // high-level
}