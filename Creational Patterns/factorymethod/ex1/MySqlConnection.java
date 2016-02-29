package factorymethod.ex1;

/*Concrete class which can be instantiated by the factory method */
public class MySqlConnection extends Connection {
	public String description() {
		return "MySQL";
	}
}