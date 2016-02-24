package decorator.ex3;

/* Core component, which should always be present */
public class SimpleWindow implements Window {
	public void draw() {
		// Draw window
	}

	public String getDescription() {
		return "simple window";
	}
}