package factorymethod.ex2;

/*Concrete class which can be instantiated by the factory method */
public class Circle implements Shape {

	private int xPos, yPos;
	private int radius;

	public Circle(int x, int y, int r) {
		setxPos(x);
		setyPos(y);
		setRadius(r);
		System.out.println("Circle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Circle draw()");
	}

	@Override
	public void fillColor() {
		System.out.println("Fill Color");
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
