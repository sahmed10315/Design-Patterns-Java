package pattern.structural.decorator.ex1;

public abstract class ComponentDecorator implements Computer {

	protected Computer computer;
	
	public ComponentDecorator(Computer c)
	{
		this.computer = c;
	}
	
	public String description() {
		return computer.description();
	}
}
