package pattern.creational.abstractfactory.ex2;

public class DisplayFriendlyRectangle implements DisplayFriendlyShape {
	public DisplayFriendlyRectangle(int length, int height) {
		this.setLength(length);
		this.setHeight(height);
		System.out.println("DisplayFriendlyRectangle constructor");
	}

	private int length, height;

	@Override
	public void draw() {
		System.out.println("DisplayFriendlyRectangle draw()"); 
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