package iterator;

import java.util.Iterator;

/* Iterator pattern provides a way to access the elements of an aggregate object(container) sequentially without
 * exposing its underlying representation. 
 * 
 * In jdk this pattern is recognizable by behavioral methods sequentially returning instances of a different type from a queue)
 * 
 * JDK Examples: All implementations of java.util.Iterator 
 *               All implementations of java.util.Enumeration
 * 
 * Reference : Effective Java Item 46
 * */
public class TestIterator {
	Division division;
	Iterator<VP> iterator;

	public static void main(String args[]) {
		new TestIterator();
	}

	public TestIterator() {
		division = new Division("Sales");

		division.add("Ted");
		division.add("Bob");
		division.add("Carol");
		division.add("Alice");

		iterator = division.iterator();
		// Using direct iterator idioms
		while (iterator.hasNext()) {
			VP vp = iterator.next();
			vp.print();
		}
		// Using for-loop made possible by implementing iterable interface
		for (VP vp : division)
			vp.print();
	}
}