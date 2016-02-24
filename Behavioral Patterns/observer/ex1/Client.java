package observer.ex1;

/* Client is loosely coupled from Subject now and does not need to know about the concrete subject. 
 * Now, both the subject and observers can be used independently */
public class Client implements Observer {
	public void update(String operation, String record) {
		System.out.println("The client says a " + operation + " operation was performed on " + record);
	}
}