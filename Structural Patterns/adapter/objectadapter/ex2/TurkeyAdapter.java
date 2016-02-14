package adapter.objectadapter.ex2;

/* Adapter class using object composition and delegation. 
 * Reference : https://en.wikipedia.org/wiki/Delegation_pattern */
public class TurkeyAdapter implements Duck {
	private Turkey t;

	public TurkeyAdapter(Turkey t) {
		this.t = t;
	}

	public void quack() {
		// A turkey is not a duck but, act like one
		t.gobble();
	}
}