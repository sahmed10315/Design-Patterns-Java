package command.ex1;

/* Invoker class */
public class Invoker {
	Command commands[] = new Command[5];
	int position;

	public Invoker() {
		position = -1;
	}

	public void setCommand(Command c) {
		if (position < commands.length - 1) {
			position++;
			commands[position] = c;
		} else {
			for (int loopIndex = 0; loopIndex < commands.length - 2; loopIndex++) {
				commands[loopIndex] = commands[loopIndex + 1];
			}
			commands[commands.length - 1] = c;
		}
	}

	public void run() {
		commands[position].execute();
	}

	public void undo() {
		if (position >= 0) {
			commands[position].undo();
		}
		position--;
	}
}