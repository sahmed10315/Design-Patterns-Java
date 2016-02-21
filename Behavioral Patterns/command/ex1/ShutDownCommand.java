package command.ex1;

/** The Command for shutting down a server - ConcreteCommand #3 */
public class ShutDownCommand implements Command {
	Receiver receiver; // Receiver is the target on which command will be executed.

	public ShutDownCommand(Receiver r) {
		receiver = r;
	}

	/*
	 * All separate steps for shutting down a server are encapsulated into one
	 * execute method
	 */
	public void execute() {
		receiver.connect();
		receiver.shutdown();
		receiver.disconnect();
		System.out.println();
	}

	public void undo() {
		System.out.println("Undoing...");
		receiver.connect();
		receiver.reboot();
		receiver.disconnect();
		System.out.println();
	}
}