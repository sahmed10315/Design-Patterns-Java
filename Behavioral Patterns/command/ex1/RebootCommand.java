package command.ex1;

public class RebootCommand implements Command {
	Receiver receiver;

	public RebootCommand(Receiver r) {
		receiver = r;
	}

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