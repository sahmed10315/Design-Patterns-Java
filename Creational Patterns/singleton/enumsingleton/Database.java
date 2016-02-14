package singleton.enumsingleton;

/* Database class is an enum singleton. The nature of enums provide guarantee against multiple instantiation. */
public enum Database {
	SINGLEOBJECT("products");
	private String name;

	private Database(String databaseName) {
		name = databaseName;
	}

	public String getName() {
		return name;
	}
}