package singleton.eagerinitialization;

/* DatabaseEager object is initialized before the class is used by any thread.
 * This approach is feasible when the object to be created is not computationally expensive.
 * This is Eager initialization approach of using singleton pattern. */
public class DatabaseEager {
	private static DatabaseEager singleObject = new DatabaseEager("products");
	private String name;

	private DatabaseEager(String n) {
		name = n;
	}

	/* No need for synchrnoized keyword */
	public static DatabaseEager getInstance() {
		return singleObject;
	}

	public String getName() {
		return name;
	}
}