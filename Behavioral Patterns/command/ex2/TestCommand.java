package command.ex2;

/* 
 * Command pattern takes encapsulation to another level, by encapsulating a set of complex actions, targeted at a 
 * particular target, into easily handled objects. When we want to execute a command, we no longer have to take all the
 * separate steps, but just use the specific prebuilt, preconfigured command object. 
 * 
 * In JDK they are recognizable by recognizable by behavioral methods in an abstract/interface type which invokes a 
 * method in an implementation of a different abstract/interface type which has been encapsulated by the command implementation 
 * during its creation
 */
public class TestCommand {
	public static void main(String[] args) {

		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);

		Switch mySwitch = new Switch();

		switch ("ON") {
		case "ON":
			mySwitch.execute(switchUp);
			break;
		case "OFF":
			mySwitch.execute(switchDown);
			break;
		default:
			System.err.println("Argument \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}
	}
}