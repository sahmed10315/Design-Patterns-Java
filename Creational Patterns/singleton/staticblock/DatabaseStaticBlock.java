package singleton.staticblock;

/* DatabasestaticBlock object is initialized in a static block, which allows some 
 * preprocessing or error checking to be done, while creating the instance.. 
 * */
public class DatabaseStaticBlock {
	private static DatabaseStaticBlock singleObject;
	private String name;

	static {
		try {
			singleObject = new DatabaseStaticBlock("products");
		} catch (Exception e) {
			throw new RuntimeException("Darn, an error occurred!", e);
		}
	}

	private DatabaseStaticBlock(String n) {
		name = n;
	}

	public static DatabaseStaticBlock getInstance() {
		return singleObject;
	}

	public String getName() {
		return name;
	}
}