package decorator.ex1;

/* Core component, which should always be present */
public class SimpleComputer implements Computer {

	@Override
	public String description() {
		return "computer";
	}
}
