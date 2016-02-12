package pattern.creational.abstractfactory.ex2;

public class PrinterFriendlyRectangle implements PrinterFriendlyShape {
	public PrinterFriendlyRectangle(int length, int height) {
		this.setLength(length);
		this.setHeight(height);
		System.out.println("PrinterFriendlyRectangle constructor");
	}

	private int length, height;

	@Override
	public void draw() {
		System.out.println("PrinterFriendlyRectangle draw()");
		// draw() implementation
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}