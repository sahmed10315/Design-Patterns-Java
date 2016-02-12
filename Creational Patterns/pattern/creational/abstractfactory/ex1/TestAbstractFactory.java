package pattern.creational.abstractfactory.ex1;

import pattern.creational.factorymethod.ex1.Connection;

public class TestAbstractFactory {
	public static void main(String args[]) {
		SecureFactory factory;

		factory = new SecureFactory();

		Connection connection = factory.createConnection("Oracle");

		System.out.println("You're connecting with " + connection.description());
	}
}