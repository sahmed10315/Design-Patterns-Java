package decorator.ex3;

/*The second concrete decorator which adds horizontal scroll bar functionality to the core component SimpleWIndow*/
public class HorizontalScrollBar extends WindowDecorator {
	public HorizontalScrollBar(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	// In the ConcreteDecorator class, override any Component method(s) whose
	// behavior needs to be modified.
	private void drawHorizontalScrollBar() {
		// Draw the horizontal scroll bar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
}