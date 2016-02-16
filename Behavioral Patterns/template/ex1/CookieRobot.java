package template.ex1;

/* Concrete subclass overrides template step methods as required for its use */
public class CookieRobot extends RobotTemplate {
	private String name;

	public CookieRobot(String n) {
		name = n;
	}

	@Override
	public void getParts() {
		System.out.println("Getting a flour and sugar....");
	}

	@Override
	public void assemble() {
		System.out.println("Baking a cookie....");
	}

	@Override
	public void test() {
		System.out.println("Crunching a cookie....");
	}

	public String getName() {
		return name;
	}
}