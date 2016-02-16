package template.ex3;

/* This template pattern examples is not as straight forward as the other three, but do utilize the template method algorithm
 * in concept, where some or all steps of an algorithm are delegated to a subclass.
 * Also this program is a good example of SOC(Separation of concern). 
 * */
public class TestTemplate {

	private static Stack stack = new Stack();;

	static {
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
	}

	public static void main(String[] args) {
		// Anonymous subclass defines an implementation of isValid for
		// filtering.
		Stack filtered = stack.filter(new StackPredicate() {
			@Override
			public boolean isValid(int i) {
				return (i % 2 == 0);
			}
		});

		System.out.println(filtered.pop() + " " + filtered.pop() + " " + filtered.pop());
		// Anonymous subclass defines an implementation of isValid for
		// filtering.
		filtered = stack.filter(new StackPredicate() {
			@Override
			public boolean isValid(int i) {
				return true;
			}
		});

		System.out.println(filtered.pop() + " " + filtered.pop() + " " + filtered.pop());
	}
}