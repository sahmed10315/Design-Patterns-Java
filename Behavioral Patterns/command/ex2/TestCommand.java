package command.ex2;

/* The test class or client */
public class TestCommand {
   public static void main(String[] args){

      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);

      Switch mySwitch = new Switch();

      switch("ON") {
         case "ON":
            mySwitch.storeAndExecute(switchUp);
            break;
         case "OFF":
            mySwitch.storeAndExecute(switchDown);
            break;
         default:
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
      }
   }
}