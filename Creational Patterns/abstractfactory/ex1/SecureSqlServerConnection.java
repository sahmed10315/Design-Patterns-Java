package abstractfactory.ex1;

import factorymethod.ex1.Connection;

public class SecureSqlServerConnection extends Connection {
	public String description() {
		return "SQL Server secure";
	}
}