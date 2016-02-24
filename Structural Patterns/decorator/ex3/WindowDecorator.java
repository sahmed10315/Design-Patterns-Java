package decorator.ex3;

/* Subclass the original "Component" into a "Decorator" class
*  In the Decorator class, add a Component pointer as a field;
*/
public abstract class WindowDecorator implements Window {
	protected Window windowToBeDecorated; // the Window being decorated

	// Pass a Component to the Decorator constructor to initialize the Component pointer;
	public WindowDecorator(Window windowToBeDecorated) {
		this.windowToBeDecorated = windowToBeDecorated;
	}

	// In the Decorator class, redirect all "Component" methods to the "Component" pointer; and
	public void draw() {
		windowToBeDecorated.draw(); // Delegation
	}

	public String getDescription() {
		return windowToBeDecorated.getDescription(); // Delegation
	}
}