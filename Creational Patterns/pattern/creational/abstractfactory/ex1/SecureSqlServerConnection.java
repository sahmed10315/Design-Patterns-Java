package pattern.creational.abstractfactory.ex1;

import pattern.creational.factorymethod.ex1.Connection;

public class SecureSqlServerConnection extends Connection {
	public SecureSqlServerConnection() {
	}

	public String description() {
		return "SQL Server secure";
	}
}