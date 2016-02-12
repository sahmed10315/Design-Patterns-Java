package pattern.creational.abstractfactory.ex1;

import pattern.creational.factorymethod.ex1.Connection;

public abstract class ConnectionFactory {
	public ConnectionFactory() {
	}

	protected abstract Connection createConnection(String type);
}