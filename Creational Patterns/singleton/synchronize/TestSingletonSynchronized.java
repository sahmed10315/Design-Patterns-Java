package singleton.synchronize;

/* This program uses lazy initialization approach for Singleton Design pattern. */
public class TestSingletonSynchronized implements Runnable {
	Thread thread;

	public static void main(String args[]) {
		 new TestSingletonSynchronized();
	}

	public TestSingletonSynchronized() {
		DatabaseSynchronized database;

		database = DatabaseSynchronized.getInstance("products");

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database.");
	}

	public void run() {
		DatabaseSynchronized database = DatabaseSynchronized.getInstance("employees");

		System.out.println("This is the " + database.getName() + " database.");
	}
}