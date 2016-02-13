package decorator.ex1;

public class CD extends ComponentDecorator { 

	public CD(Computer c) {
		super(c); 
	}
	
	@Override
	public String description() {
		return super.description() + " and a CD";
	}
}
