package observer.ex1;

/* The observer pattern is a software design pattern in which an object, called the subject, maintains a 
 * list of its dependents, called observers, and notifies them automatically of any state changes, usually 
 * by calling one of their methods. 
 * 
 * This method follows OOP principle of loose coupling.
 * 
 * In jdk this pattern is used by using listeners that listen for user interface events.
 * java.util.Observer/java.util.Observable (rarely used in real world though)
 * All implementations of java.util.EventListener (practically all over Swing thus)
 * 
 * Reference : Effective Java Item 67
 * */
public class TestObserver {
	public static void main(String args[]) {
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();

		database.registerObserver(archiver);
		database.registerObserver(client);
		database.registerObserver(boss);
		database.editRecord("delete", "record 1");
	}
}