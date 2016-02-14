package singleton.enumsingleton;

/* This program uses Enum singletons. 
 * Reference: Effective Java, Item 3 */
public class TestSingletonEnum {
	public static void main(String args[]) {
		Database database;

		database = Database.SINGLEOBJECT;

		System.out.println("This is the " + database.getName() + " database.");

	}
}