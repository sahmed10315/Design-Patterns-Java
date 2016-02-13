package singleton.doublecheckedlocking;

/* Thread safe Database Singleton class using double check locking idiom. */
public class DatabaseDCL {
	private static volatile DatabaseDCL singleObject;
	private String name;

	private DatabaseDCL(String n) {
		name = n;
	}

	public static DatabaseDCL getInstance(String n) {
		if (singleObject == null) {
			synchronized (DatabaseDCL.class) {
				if (singleObject == null) {
					singleObject = new DatabaseDCL(n); 
				}
			}
		}
		return singleObject;
	}

	public String getName() {
		return name;
	}
}