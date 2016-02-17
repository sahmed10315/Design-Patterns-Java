package iterator;

import java.util.Iterator;

/* Division class contains the collection, which will be traversed by the iterator. Also objects implementing the Iterable interface, 
 * which returns an Iterator from its only method, can be traversed using the enhanced for loop syntax.
 * The Collection interface from the Java collections framework extends Iterable. So all collections can be used in for - loop.
 */
public class Division implements Iterable<VP> {

	private VP[] vps = new VP[100];
	private int number = 0;
	private String name;

	public Division(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void add(String n) {
		VP vp = new VP(n, name);
		vps[number++] = vp;
	}

	/* Overriding method to make for-loop possible */
	@Override
	public Iterator<VP> iterator() {
		return new DivisionIterator(vps);
	}

}
