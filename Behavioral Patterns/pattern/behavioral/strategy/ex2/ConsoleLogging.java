package pattern.behavioral.strategy.ex2;

public class ConsoleLogging implements Logging {

	@Override
	public void write(String message) {
		System.out.println(message); 
	}

}
