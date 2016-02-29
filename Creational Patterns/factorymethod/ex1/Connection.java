package factorymethod.ex1;

/* All the objects which the factory creates must be derived from this class */
public abstract class Connection {
	public String description() {
		return "Generic";
	}
}