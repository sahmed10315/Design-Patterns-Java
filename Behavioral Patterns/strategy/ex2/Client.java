package strategy.ex2;

public class Client {

	private final Logging logging;

	public Client(Logging logging) {
		this.logging = logging;
	}

	public void doWork(final int count) {
		if (count % 2 == 0) {
			logging.write("Even number: " + count);
		}
	}
}
