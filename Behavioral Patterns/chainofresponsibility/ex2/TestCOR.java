package chainofresponsibility.ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Chain of responsibility is about notifying other objects in a chain, where a notification travels down from one object to another, 
 * until it reaches an object capable of processing it.
 * 
 * In JDK they are recognizable by behavioral methods which (indirectly) invokes the same method in another implementation of same abstract/interface type in a queue)
 * Examples: java.util.logging.Logger#log()
 */
public class TestCOR {
	public static void main(String[] args) {
		ManagerPPower manager = new ManagerPPower();
		DirectorPPower director = new DirectorPPower();
		VicePresidentPPower vp = new VicePresidentPPower();
		PresidentPPower president = new PresidentPPower();
		manager.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(president);

		// Press Ctrl+C to end.
		try {
			while (true) {
				System.out.println("Enter the amount to check who should approve your expenditure.");
				System.out.print(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new PurchaseRequest(d, "General"));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}
}