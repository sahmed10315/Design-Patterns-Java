package composite.ex1;

import java.util.*;

/* Composite object, A division may contain other subdivisions and VPS */
public class Division implements Corporate {

	private List<Corporate> corporateList = new ArrayList<Corporate>();
	private String name;

	public Division(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	/* Adds the corporate(Division, VP) to the composition. */
	public void add(Corporate c) {
		corporateList.add(c);
	}

	public void print() {
		for (Corporate corporate : corporateList) {
			corporate.print();
		}
	}
}