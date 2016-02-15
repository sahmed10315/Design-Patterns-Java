package adapter.objectadapter.ex2;

/* Adapter convert the interface of a class into another interface clients expect
 *  
 * Reference : Effective Java, Page 8, 22, 95, 107 
 * In JDK they are recognizable by creational methods taking an instance of different abstract/interface 
 * 		   type and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
 * 
 * JDK Examples:   java.util.Arrays#asList()
 *  	  		   java.io.InputStreamReader(InputStream) (returns a Reader)
 *        		   java.io.OutputStreamWriter(OutputStream) (returns a Writer) */
public class TestObjectAdapter {
	public static void main(String args[]) {
		Turkey turkey = new Turkey();

		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		adapter.quack();
	}
}