package singleton.lazyinitialization;

/* This program uses lazy initialization approach for Singleton Design pattern. 
 * Reference: Effective Java, Item 71 */
public class TestSingleton {
	public static void main(String args[]) {
		Database database;

		database = Database.getInstance("products");

		System.out.println("This is the " + database.getName() + " database.");

		database = Database.getInstance("employees");

		System.out.println("This is the " + database.getName() + " database.");
	}
}