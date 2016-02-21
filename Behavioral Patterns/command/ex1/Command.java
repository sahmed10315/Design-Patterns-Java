package command.ex1;

/** The Command interface */
public interface Command {
	public void execute();

	public void undo();
}