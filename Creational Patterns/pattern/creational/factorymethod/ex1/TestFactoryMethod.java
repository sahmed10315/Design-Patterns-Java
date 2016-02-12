package pattern.creational.factorymethod.ex1;

public class TestFactoryMethod {
	public static void main(String args[]) {
		FirstFactory factory;

		factory = new FirstFactory();

		Connection connection = factory.createConnection("Oracle");

		System.out.println("You're connecting with " + connection.description());
	}
}