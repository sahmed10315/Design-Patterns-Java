package singleton.eagerinitialization;

// This uses eager initialization approach
public class TestSingletonEager implements Runnable {
	Thread thread;

	public static void main(String args[]) {
		 new TestSingletonEager();
	}

	public TestSingletonEager() {
		DatabaseEager database;

		database = DatabaseEager.getInstance();

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database.");
	}

	public void run() {
		DatabaseEager database;

		database = DatabaseEager.getInstance();

		System.out.println("This is the " + database.getName() + " database.");
	}
}