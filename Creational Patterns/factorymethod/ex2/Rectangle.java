package factorymethod.ex2;

/*Concrete class which can be instantiated by the factory method */
public class Rectangle implements Shape {

	private int length, height;

	public Rectangle(int length, int height) {
		this.setLength(length);
		this.setHeight(height);
		System.out.println("Rectangle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
	}

	@Override
	public void fillColor() {
		System.out.println("Rectangle fillColor()");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
