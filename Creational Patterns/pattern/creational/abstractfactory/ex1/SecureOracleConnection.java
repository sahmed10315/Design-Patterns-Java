package pattern.creational.abstractfactory.ex1;

import pattern.creational.factorymethod.ex1.Connection;

public class SecureOracleConnection extends Connection {
	public SecureOracleConnection() {
	}

	public String description() {
		return "Oracle secure";
	}
}