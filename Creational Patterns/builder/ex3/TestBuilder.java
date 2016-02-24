package builder.ex3;

/* A builder pattern builds a composite. Instead of creating the desired object directly, the client calls a constructor with all of the 
 * required parameters, and gets a builder object.
 * Then the client calls setter like methods on the builder object to set each optional parameter of interest. Finally the client
 * calls a parameterless build method to generate the object, which is immutable.
 * 
 * In JDK they are recognizable by creational methods returning the instance itself
 * 
 * Effective Java: Item 2
 * 
 * JDK Examples:   java.lang.StringBuilder#append() (unsynchronized)
 * 				   java.lang.StringBuffer#append() (synchronized)
 * 				   java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
 * */
public class TestBuilder {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		final LibraryBook.Builder builder = new LibraryBook.Builder();
        final LibraryBook book = builder
                .withBookName("War and Peace")
                .build();
	}
}