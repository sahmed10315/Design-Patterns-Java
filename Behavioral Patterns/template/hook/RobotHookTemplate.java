package template.hook;

/* This class defines the main template algorithm and step methods of the algorithm.
 * Template step methods can be abstract if all subclasses must define its own implementation, 
 * or they can be generic for reuse in subclasses.
 * In this example they are not abstract.
 */
public abstract class RobotHookTemplate {
	/*
	 * Template algorithm method made up of multiple steps, whose structure and
	 * order of steps will not be changed by subclasses, but can be modified to
	 * some extent by overriding the hook method testOk().
	 */
	public final void go() {
		start();
		getParts();
		assemble();
		// The test will be executed, depending on the implementation of subclass to return true or false.
		if (testOK()) {
			test();
		}
		stop();
	}

	/* This method can be overridden by a subclass if required */
	public void start() {
		System.out.println("Starting....");
	}

	/* This method can be overridden by a subclass if required */
	public void getParts() {
		System.out.println("Getting parts....");
	}

	/* This method can be overridden by a subclass if required */
	public void assemble() {
		System.out.println("Assembling....");
	}

	/* This method can be overridden by a subclass if required */
	public void test() {
		System.out.println("Testing....");
	}

	/* This method can be overridden by a subclass if required */
	public void stop() {
		System.out.println("Stopping....");
	}

	/* Hook method */
	public boolean testOK() {
		return true;
	}
}