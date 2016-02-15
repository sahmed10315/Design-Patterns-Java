package facade.ex2;

/* A Facade pattern is used when an easier or simpler interface to an underlying object is desire. 
 * It typically involves a single wrapper class which contains a set of members required by client.
 * It follows the design principle of Law of demeter(loose coupling).  
 * 
 * In JDK they are recognizable by behavioral methods which internally uses instances of different 
 * independent abstract/interface types) 
 * 
 * JDK Examples:   java.awt.Adapter* classes
 * */
public class TestFacade {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
}