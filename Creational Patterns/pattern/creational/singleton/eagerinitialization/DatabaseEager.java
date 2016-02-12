package pattern.creational.singleton.eagerinitialization;

/* DatabaseEager object is initialized before the class is used by any thread.
This is Eager initialization approach of using singleton pattern. */
public class DatabaseEager {
	private static DatabaseEager singleObject = new DatabaseEager("products");
	private String name;

	private DatabaseEager(String n) {
		name = n;
	}

	public static DatabaseEager getInstance() {
		return singleObject;
	}

	public String getName() {
		return name;
	}
}