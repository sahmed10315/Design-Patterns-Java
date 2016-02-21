package command.ex1;

public class USServer implements Receiver {
	public USServer() {
	}

	public void connect() {
		System.out.println("You're connected to the US server.");
	}

	public void diagnostics() {
		System.out.println("The US server diagnostics check out OK.");
	}

	public void shutdown() {
		System.out.println("Shutting down the US server.");
	}

	public void reboot() {
		System.out.println("Rebooting the US server.");
	}

	public void disconnect() {
		System.out.println("You're disconnected from the US server.");
	}

}