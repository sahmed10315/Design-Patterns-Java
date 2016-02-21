package command.ex1;

public class EuroServer implements Receiver {
	public EuroServer() {
	}

	public void connect() {
		System.out.println("You're connected to the Euro server.");
	}

	public void diagnostics() {
		System.out.println("The Euro server diagnostics check out OK.");
	}

	public void shutdown() {
		System.out.println("Shutting down the Euro server.");
	}

	public void reboot() {
		System.out.println("Rebooting the Euro server.");
	}

	public void disconnect() {
		System.out.println("You're disconnected from the Euro server.");
	}

}