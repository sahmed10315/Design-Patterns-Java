package template.hook;

/* Concrete subclass overrides template step methods as required for its use */
public class CookieHookRobot extends RobotHookTemplate {
	private String name;

	public CookieHookRobot(String n) {
		name = n;
	}

	public void getParts() {
		System.out.println("Getting a flour and sugar....");
	}

	public void assemble() {
		System.out.println("Baking a cookie....");
	}

	public String getName() {
		return name;
	}

	/*
	 * Overriding hook method testOk(), to return false, so test() will not be
	 * executed
	 */
	public boolean testOK() {
		return false;
	}

}