package pattern.structural.decorator.ex1;

public class Disk extends ComponentDecorator { 

	public Disk(Computer c) {
		super(c);
	}

	public String description() {
		return super.description() + " and a disk";
	}
}