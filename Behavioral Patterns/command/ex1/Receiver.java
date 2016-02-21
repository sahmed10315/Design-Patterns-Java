package command.ex1;

/* Receiver interface */
public interface Receiver {
	public void connect();

	public void diagnostics();

	public void reboot();

	public void shutdown();

	public void disconnect();
}