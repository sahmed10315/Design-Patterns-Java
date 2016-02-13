package decorator.ex3;

//The first concrete decorator which adds vertical scrollbar functionality
public class VerticalScrollBarDecorator extends WindowDecorator {
	public VerticalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}

	private void drawVerticalScrollBar() {
		// Draw the vertical scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
}