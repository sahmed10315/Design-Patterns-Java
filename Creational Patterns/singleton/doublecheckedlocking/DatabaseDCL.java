package singleton.doublecheckedlocking;

/* Double check locking idiom is a technique of lazy initialization, where the object is checked twice for being null, 
 * first without the lock, and if found not initialized, its tested with the synchronized lock. */
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