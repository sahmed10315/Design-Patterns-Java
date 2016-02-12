package pattern.creational.abstractfactory.ex2;

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
	private int xPos, yPos;
	private int radius;

	public DisplayFriendlyCircle(int x, int y, int r) {
		setxPos(x);
		setyPos(y);
		setRadius(r);
		System.out.println("DisplayFriendlyCircle constructor");
	}

	@Override
	public void draw() {
		System.out.println("DisplayFriendlyCircle draw()");
		// draw() implementation
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

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
}
