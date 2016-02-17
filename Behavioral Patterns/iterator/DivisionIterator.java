package iterator;

import java.util.Iterator;

/* Division Iterator is a stand alone class, to follow the Single Responsibility Principle 
 * By implementing the Iterator interface, the client can access the members in a standard, accepted way
 * defined by the interface.
 */
public class DivisionIterator implements Iterator<VP> {

	private VP[] vps;
	private int location = 0;

	public DivisionIterator(VP[] v) {
		vps = v;
	}

	@Override
	public boolean hasNext() {
		if (location < vps.length && vps[location] != null) {
			return true;
		} else
			return false;
	}

	@Override
	public VP next() {
		return vps[location++];
	}

}
