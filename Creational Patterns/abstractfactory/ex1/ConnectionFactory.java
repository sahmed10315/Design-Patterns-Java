package abstractfactory.ex1;

import factorymethod.ex1.Connection;

public abstract class ConnectionFactory {
	public ConnectionFactory() {
	}

	protected abstract Connection createConnection(String type);
}