package composite.ex1;

/* Composite pattern compose objects into tree structures to represent part-whole hierarchies, which lets 
 * clients treat individual objects and composition of objects uniformly 
 * 
 * Composite pattern in JDK is recognizable by behavioral methods taking an instance of 
 * same abstract/interface type into a tree structure.
 * 
 * JDK example: XML Node interface.
 * */
public class TestComposite {

	public static void main(String args[]) {
		Corporation corporation = new Corporation();

		Division rnd = new Division("R&D");
		rnd.add(new VP("Steve", "R&D"));
		rnd.add(new VP("Mike", "R&D"));
		rnd.add(new VP("Nancy", "R&D"));

		corporation.add(rnd);

		Division sales = new Division("Sales");
		sales.add(new VP("Ted", "Sales"));
		sales.add(new VP("Bob", "Sales"));
		sales.add(new VP("Carol", "Sales"));
		sales.add(new VP("Alice", "Sales"));

		Division western = new Division("Western Sales");
		western.add(new VP("Wally", "Western Sales"));
		western.add(new VP("Andre", "Western Sales"));

		sales.add(western);
		corporation.add(sales);

		VP vp = new VP("Cary", "At Large");

		corporation.add(vp);
		
		// prints the whole corporation as a composite.
		corporation.print();
	}
}