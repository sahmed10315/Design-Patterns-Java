package observer.ex2;

public class TestObserver {
	public static void main(String[] s) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.setCanvas(new Canvas());
		circle.setShapeArchiver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);
	}
}