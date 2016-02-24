package decorator.ex1;

/*The first concrete decorator which a Disk to the core component SimpleComputer */
public class Disk extends ComponentDecorator {

	public Disk(Computer c) {
		super(c);
	}

	public String description() {
		return super.description() + " and a disk";
	}
}