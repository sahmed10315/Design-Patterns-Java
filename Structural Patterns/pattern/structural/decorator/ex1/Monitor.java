package pattern.structural.decorator.ex1;

public class Monitor extends ComponentDecorator {

	public Monitor(Computer c) {
		super(c);
	}

	public String description() {
		return super.description() + " and a monitor";
	}
}