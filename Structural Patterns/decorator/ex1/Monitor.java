package decorator.ex1;

/*The second concrete decorator which adds Monitor to the core component SimpleComputer */
public class Monitor extends ComponentDecorator {

	public Monitor(Computer c) {
		super(c);
	}

	public String description() {
		return super.description() + " and a monitor";
	}
}