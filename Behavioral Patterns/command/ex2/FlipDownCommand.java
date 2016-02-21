package command.ex2;

/** The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
   private Light theLight;

   public FlipDownCommand(Light light) {
      this.theLight = light;
   }

   @Override    // Command
   public void execute() {
      theLight.turnOff();
   }
}