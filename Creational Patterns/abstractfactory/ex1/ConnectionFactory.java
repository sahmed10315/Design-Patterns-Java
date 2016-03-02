package abstractfactory.ex1;

import factorymethod.ex1.Connection;

/* Abstract specification for implementing an actual object factory */
public interface ConnectionFactory {
	public Connection createConnection(String type);
}