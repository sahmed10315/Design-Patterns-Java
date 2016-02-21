package command.ex1;

/* 
 * Command pattern takes encapsulation to another level, by encapsulating a set of complex actions, targeted at a 
 * particular target, into easily handled objects. When we want to execute a command, we no longer have to take all the
 * separate steps, but just use the specific prebuilt, preconfigured command object. 
 * 
 * In short command pattern is about encapsulating commands in an object, and the resulting object is treated more as a "verb"
 * than as a "noun".
 * 
 * In JDK they are recognizable by recognizable by behavioral methods in an abstract/interface type which invokes a 
 * method in an implementation of a different abstract/interface type which has been encapsulated by the command implementation 
 * during its creation
 */
public class TestCommands {
	public static void main(String args[]) {
		new TestCommands();
	}

	public TestCommands() {
		Invoker invoker = new Invoker();

		// Create the receivers
		AsiaServer asiaServer = new AsiaServer();
		// EuroServer euroServer = new EuroServer();
		// USServer usServer = new USServer();

		// Create the commands
		ShutDownCommand shutDownAsia = new ShutDownCommand(asiaServer);
		// RunDiagnosticsCommand runDiagnosticsAsia = new
		// RunDiagnosticsCommand(asiaServer);
		RebootCommand rebootAsia = new RebootCommand(asiaServer);
		// ShutDownCommand shutDownEuro = new ShutDownCommand(euroServer);
		// RunDiagnosticsCommand runDiagnosticsEuro = new
		// RunDiagnosticsCommand(euroServer);
		// RebootCommand rebootEuro = new RebootCommand(euroServer);
		// ShutDownCommand shutDownUS = new ShutDownCommand(usServer);
		// RunDiagnosticsCommand runDiagnosticsUS = new
		// RunDiagnosticsCommand(usServer);
		// RebootCommand rebootUS = new RebootCommand(usServer);

		invoker.setCommand(shutDownAsia);
		invoker.run();

		invoker.setCommand(rebootAsia);
		invoker.run();

		invoker.undo();
		invoker.undo();
	}
}