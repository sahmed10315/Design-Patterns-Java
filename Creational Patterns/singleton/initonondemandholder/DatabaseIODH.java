package singleton.initonondemandholder;

/*  Safe, highly concurrent lazy initialization with good performance 
 *  Singleton class using Initialization-on-demand holder idiom. 
 *  Reference: Effective Java, Item 71 */
public class DatabaseIODH {

	private DatabaseIODH(String n) {
		name = n;
	}

	private static class DatabaseLazyHolder {
		private static final DatabaseIODH singleObject = new DatabaseIODH("products");
	}

	private String name;

	public static DatabaseIODH getInstance(String n) {
		return DatabaseLazyHolder.singleObject;
	}

	public String getName() {
		return name;
	}
}