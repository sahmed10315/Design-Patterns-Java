package mediator;

public class Exit {
	Mediator mediator;

	public Exit(Mediator m) {
		mediator = m;
	}

	public void go() {
		System.out.println("Please come again sometime.");
	}
}