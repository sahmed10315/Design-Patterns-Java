package builder.ex1;

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
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
				.calories(100)
				.sodium(35)
				.carbohydrate(27)
				.build();
	}
}