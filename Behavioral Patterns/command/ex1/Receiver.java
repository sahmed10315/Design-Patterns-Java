package command.ex1;

public interface Receiver {
	public void connect();

	public void diagnostics();

	public void reboot();

	public void shutdown();

	public void disconnect();
}