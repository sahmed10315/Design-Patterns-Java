package adapter.objectadapter.ex1;

/* Adapter convert the interface of a class into another interface clients expect.
 * (Class adapter pattern is not possible in java because of multiple inheritance not supported). 
 * Reference : Effective Java, Page 8 , 22, 95, 107 
 * In JDK they are recognizable by creational methods taking an instance of different abstract/interface 
 * 		   type and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
 * 
 * JDK Examples:   java.util.Arrays#asList()
 *  	  		   java.io.InputStreamReader(InputStream) (returns a Reader)
 *        		   java.io.OutputStreamWriter(OutputStream) (returns a Writer) */
public class TestObjectAdapter {
	public static void main(String args[]) {
		AceClass aceObject = new AceClass();

		aceObject.setName("Cary Grant");

		AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);

		System.out.println("Customer's first name: " + adapter.getFirstName());
		System.out.println("Customer's last name: " + adapter.getLastName());
	}
}