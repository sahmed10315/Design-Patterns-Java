package memento;

/* Memento pattern without violating encapsulation, captures and externalize an objects internal state so it can be restored to this state later 
 * Example of memento pattern can be an implementation of a finite state machine*/
public class TestMemento {
	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #1");
		originator.setState("State #2");
		// Usually changing the state of originator is done by the caretaker
		// object
		// but for clearance its being done outside in the main method.
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
}