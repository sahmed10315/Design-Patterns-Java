package template.hook;

/* Template pattern define a skeleton of an algorithm. It lets subclasses redefine certain
 * steps of the algorithm without changing the algorithm structure 
 * This program shows how to provide a hook into the algorithm, which can control some aspect of 
 * the template algorithm(which by definition is unchangeable).
 * */
public class TestHookTemplate {
	public static void main(String args[]) {
		CookieHookRobot cookieHookRobot = new CookieHookRobot("Cookie Robot");

		System.out.println(cookieHookRobot.getName() + ":");
		cookieHookRobot.go();
	}
}