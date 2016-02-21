package command.ex1;

/** The Command for running diagnostics on server - ConcreteCommand #2 */
public class RunDiagnosticsCommand implements Command {
	Receiver receiver; // Receiver is the target on which command will be executed.

	public RunDiagnosticsCommand(Receiver r) {
		receiver = r;
	}

	/*
	 * All separate steps for running diagnostic are encapsulated into one
	 * execute method
	 */
	public void execute() {
		receiver.connect();
		receiver.diagnostics();
		receiver.disconnect();
		System.out.println();
	}

	public void undo() {
		System.out.println("Can't Undo.");
		System.out.println();
	}
}