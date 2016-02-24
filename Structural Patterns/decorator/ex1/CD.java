package decorator.ex1;

/*The third concrete decorator which adds CD to the core component SimpleComputer */
public class CD extends ComponentDecorator {

	public CD(Computer c) {
		super(c);
	}

	@Override
	public String description() {
		return super.description() + " and a CD";
	}
}
