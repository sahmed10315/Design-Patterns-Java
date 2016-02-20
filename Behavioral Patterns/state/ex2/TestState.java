package state.ex2;

public class TestState {
	public static void main(String[] args) {
		final StateContext sc = new StateContext();

		sc.writeName("Monday");
		sc.writeName("Tuesday");
		sc.writeName("Wednesday");
		sc.writeName("Thursday");
		sc.writeName("Friday");
		sc.writeName("Saturday");
		sc.writeName("Sunday");
	}
}