package pattern.creational.singleton.lazyinitialization;
/* This program uses lazy initialization approach for Singleton Design pattern. */
public class TestSingleton {
	public static void main(String args[]) {
		Database database;

		database = Database.getInstance("products");

		System.out.println("This is the " + database.getName() + " database.");

		database = Database.getInstance("employees");

		System.out.println("This is the " + database.getName() + " database."); 
	}
}