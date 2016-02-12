package pattern.creational.factorymethod.ex1;

public class MySqlConnection extends Connection {
	public MySqlConnection() {
	}

	public String description() {
		return "MySQL";
	}
}