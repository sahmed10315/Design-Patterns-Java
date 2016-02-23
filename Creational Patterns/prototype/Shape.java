package prototype;

/* 
 * To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. 
 * Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, 
 * and implements the clone() operation.
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
}