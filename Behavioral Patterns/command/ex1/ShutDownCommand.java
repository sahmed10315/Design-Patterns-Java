package command.ex1;

public class ShutDownCommand implements Command {
	Receiver receiver;

	public ShutDownCommand(Receiver r) {
		receiver = r;
	}

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