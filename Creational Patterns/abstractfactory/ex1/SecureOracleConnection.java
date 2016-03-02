package abstractfactory.ex1;

import factorymethod.ex1.Connection;

public class SecureOracleConnection extends Connection {
	public String description() {
		return "Oracle secure";
	}
}