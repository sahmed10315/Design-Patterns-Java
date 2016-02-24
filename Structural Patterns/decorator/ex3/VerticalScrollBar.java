package decorator.ex3;

/* The first concrete decorator which adds vertical scrollbar functionality to the core component SimpleWindow */
public class VerticalScrollBar extends WindowDecorator {
	public VerticalScrollBar(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}
	// In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified.
	private void drawVerticalScrollBar() {
		// Draw the vertical scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
}