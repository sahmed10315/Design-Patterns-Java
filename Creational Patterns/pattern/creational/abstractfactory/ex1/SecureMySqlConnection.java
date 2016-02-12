package pattern.creational.abstractfactory.ex1;

import pattern.creational.factorymethod.ex1.Connection;

public class SecureMySqlConnection extends Connection {
	public SecureMySqlConnection() {
	}

	public String description() {
		return "MySQL secure";
	}
}