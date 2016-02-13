package singleton.staticblock;

// This uses eager initialization approach
public class TestSingletonStaticBlock implements Runnable {
	Thread thread;

	public static void main(String args[]) {
		 new TestSingletonStaticBlock();
	}

	public TestSingletonStaticBlock() {
		DatabaseStaticBlock database;

		database = DatabaseStaticBlock.getInstance();

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database.");
	}

	public void run() {
		DatabaseStaticBlock database;

		database = DatabaseStaticBlock.getInstance();

		System.out.println("This is the " + database.getName() + " database.");
	}
}