package memento;

import java.util.ArrayList;
import java.util.List;

import memento.Originator.Memento;

/* Responsible for keeping the memento. 
 * Caretaker is the object which can change the state of originator object, but also have the possibility of restoring it
 * Also caretaker must not do any operations or any access any internal state stored by the memento and thus honors encapsulation. */
public class CareTaker {
	private List<Originator.Memento> mementoList = new ArrayList<Originator.Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}