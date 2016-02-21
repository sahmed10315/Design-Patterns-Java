package command.ex2;

import java.util.List;
import java.util.ArrayList;

/**
 * The invoker class is not necessary if we only have an
 * execute method, but primary reason for invokers is also to keep track of
 * multiple commands in a log or queue, which makes undoing a sequence of
 * commands possible
 */
public class Switch {
	private List<Command> history = new ArrayList<Command>(); // Log for the
																// step of
																// commands

	public void storeAndExecute(Command cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}
