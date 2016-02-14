package singleton.synchronize;

/* Thread safe Database Singleton class but with poor performance. */
public class DatabaseSynchronized {
	private static DatabaseSynchronized singleObject; // by default, this field
														// is null
	private String name;

	private DatabaseSynchronized(String n) {
		name = n;
	}

	/* Thread safe getInstance method through synchronized keyword. */
	public static synchronized DatabaseSynchronized getInstance(String n) {
		if (singleObject == null) {
			singleObject = new DatabaseSynchronized(n);
		}

		return singleObject;
	}

	public String getName() {
		return name;
	}
}