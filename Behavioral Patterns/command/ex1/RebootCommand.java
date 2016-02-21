package command.ex1;

/** The Command for rebooting a server - ConcreteCommand #1 */
public class RebootCommand implements Command {
	Receiver receiver; // Receiver is the target on which command will be executed.

	public RebootCommand(Receiver r) {
		receiver = r;
	}

	/*
	 * All separate steps for rebooting a server are encapsulated into one
	 * execute method
	 */
	public void execute() {
		receiver.connect();
		receiver.reboot();
		receiver.disconnect();
		System.out.println();
	}

	public void undo() {
		System.out.println("Undoing...");
		receiver.connect();
		receiver.shutdown();
		receiver.disconnect();
		System.out.println();
	}
}