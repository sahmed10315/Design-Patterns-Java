package abstractfactory.ex2;

public class PrinterFriendlyCircle implements PrinterFriendlyShape {
	private int xPos, yPos;
	private int radius;

	public PrinterFriendlyCircle(int x, int y, int r) {
		setxPos(x);
		setyPos(y);
		setRadius(r);
		System.out.println("PrinterFriendlyCircle constructor");
	}

	@Override
	public void draw() {
		System.out.println("PrinterFriendlyCircle draw()");
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
