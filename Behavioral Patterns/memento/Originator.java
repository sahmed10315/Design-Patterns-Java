package memento;

/* The originator is an object that has an internal state */
public class Originator {
	private String state; // internal state

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	/* Creates a memento object capturing the originators internal state. */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	/* Use the memento object to restore its previous state. */
	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}

	/* Stores internal state of the Originator object */
	public static class Memento {
		private String state;

		public Memento(String state) {
			this.state = state;
		}

		public String getState() {
			return state;
		}
	}
}