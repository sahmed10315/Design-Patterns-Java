package composite.ex2;

/* Composite pattern compose objects into tree structures to represent part-whole hierarchies, which lets 
 * clients treat individual objects and composition of objects uniformly 
 * 
 * Composite pattern in JDK is recognizable by behavioral methods taking an instance of 
 * same abstract/interface type into a tree structure.
 * 
 * JDK example: XML Node interface.
 * */
public class TestComposite {

	public static void main(String[] args) {
		// Initialize four ellipses
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();
		Ellipse ellipse4 = new Ellipse();

		// Initialize three composite graphics
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		// Composes the graphics
		graphic1.add(ellipse1);
		graphic1.add(ellipse2);
		graphic1.add(ellipse3);

		graphic2.add(ellipse4);

		graphic.add(graphic1);
		graphic.add(graphic2);

		// Prints the complete graphic (four times the string "Ellipse").
		graphic.print();
	}
}