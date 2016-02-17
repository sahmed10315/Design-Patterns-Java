package composite.ex1;

import java.util.*; 

/* Composite object */
public class Corporation {
	private List<Corporate> corporateList = new ArrayList<Corporate>();  

	/* Adds the corporate(Division, VP) to the composition. */
	public void add(Corporate c) {
		corporateList.add(c);
	}
	
	/* Prints the collection */
	public void print() {
		for (Corporate corporate : corporateList) {
			corporate.print();
		}
	}
}