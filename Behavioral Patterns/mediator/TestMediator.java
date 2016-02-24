package mediator;

/* 
 * Mediator pattern involves coordination between objects. Mediator pattern brings a central processing object, where we reducing coupling between objects by placing all 
 * interaction related code into the mediator. So each object no longer known the details on how to interact with other objects, but rely on mediator object instead.
 * 
 * Mediator is another design pattern which follows loose coupling strongly.
 *  
 * In JDK mediator pattern is recognizeable by behavioral methods taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance)
 * Examples: java.util.Timer (all scheduleXXX() methods)
 *           java.util.concurrent.Executor#execute()
 *  	     java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
 *  	     java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
 *  	     java.lang.reflect.Method#invoke()
 */
public class TestMediator {
	public static void main(String args[]) {
		Mediator mediator = new Mediator();

		mediator.getWelcome().go();
	}
}