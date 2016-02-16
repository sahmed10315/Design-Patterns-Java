package template.ex2;

/* Template pattern define a skeleton of an algorithm. It lets subclasses redefine certain
 * steps of the algorithm without changing the algorithm structure 
 * In JDK they are recognizable by behavioral methods which already have a "default" behavior defined by an abstract type)
 * 
 * JDK examples: All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
 * 				 All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
 * */
public class TestTemplate {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();

		System.out.println();

		game = new Football();
		game.play();
	}
}