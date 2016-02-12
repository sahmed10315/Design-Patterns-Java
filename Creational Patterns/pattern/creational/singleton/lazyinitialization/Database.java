package pattern.creational.singleton.lazyinitialization;

/* Database class must be instantiated only once , it is to ensure that 
   whole application makes use of the same Database instance. 
   This is lazy initialization approach of using singleton pattern, and is thread unsafe. */
public class Database {
	private static Database singleObject; // by default, this field is null
	private String name;

	// declare the constructor private to prevent clients
	// from instantiating an object directly.
	private Database(String databaseName) {
		name = databaseName;
	}

	public static Database getInstance(String n) {
		if (singleObject == null) {
			singleObject = new Database(n);
		}
		// return the same object instance any time this method is called
		return singleObject;
	}

	public String getName() {
		return name;
	}
}