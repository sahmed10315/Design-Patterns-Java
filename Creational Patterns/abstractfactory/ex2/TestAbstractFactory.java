package abstractfactory.ex2;

/* Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 * In a way it means abstract factory pattern describes a factory of factories
 * 
 * In JDK they are recognizable by creational methods returning the factory itself which in turn can be used to create another abstract/interface type
 * Examples: javax.xml.parsers.DocumentBuilderFactory#newInstance()
 *           javax.xml.transform.TransformerFactory#newInstance()
 *           javax.xml.xpath.XPathFactory#newInstance()
 */
public class TestAbstractFactory {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle", "DisplayFriendly");
		canvas.addNewShape("Rectangle", "DisplayFriendly");
		canvas.redraw();
	}
}