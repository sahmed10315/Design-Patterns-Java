package builder.ex2;

/* A builder pattern builds a composite. Instead of creating the desired object directly, the client calls a constructor with all of the 
 * required parameters, and gets a builder object.
 * Then the client calls setter like methods on the builder object to set each optional parameter of interest. Finally the client
 * calls a parameterless build method to generate the object, which is immutable.
 * 
 * In JDK they are recognizable by creational methods returning the instance itself
 * 
 * JDK Examples:   java.lang.StringBuilder#append() (unsynchronized)
 * 				   java.lang.StringBuffer#append() (synchronized)
 * 				   java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
 * */
public class TestBuilder {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder
				.withAnimal(Animal.CAT)
				.withPetName("Squidge")
				.withOwnerName("Simon Smith")
				.withAddress("123 High Street")
				.withTelephone("07777777770")
				.withEmailAddress("simon@email.com")
				.build();
		// test pass - no exception thrown

		final Pet.Builder builder1 = new Pet.Builder();
		final Pet pet1 = builder
				.withAnimal(Animal.DOG)
				.withPetName("Fido")
				.withOwnerName("Simon Smith")
				.build();
	}
}