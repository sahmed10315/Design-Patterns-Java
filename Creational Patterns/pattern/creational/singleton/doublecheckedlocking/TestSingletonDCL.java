package pattern.creational.singleton.doublecheckedlocking;

// This uses lazy initialization approach
public class TestSingletonDCL implements Runnable {
	Thread thread;

	public static void main(String args[]) {
		 new TestSingletonDCL();
	}

	public TestSingletonDCL() {
		DatabaseDCL database;

		database = DatabaseDCL.getInstance("products");

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database.");
	}

	public void run() {
		DatabaseDCL database = DatabaseDCL.getInstance("employees");

		System.out.println("This is the " + database.getName() + " database.");
	}
}