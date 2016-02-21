package command.ex1;

public class AsiaServer implements Receiver {
	public AsiaServer() {
	}

	public void connect() {
		System.out.println("You're connected to the Asia server.");
	}

	public void diagnostics() {
		System.out.println("The Asia server diagnostics check out OK.");
	}

	public void shutdown() {
		System.out.println("Shutting down the Asia server.");
	}

	public void reboot() {
		System.out.println("Rebooting the Asia server.");
	}

	public void disconnect() {
		System.out.println("You're disconnected from the Asia server.");
	}
}