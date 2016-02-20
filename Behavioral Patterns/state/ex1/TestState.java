package state.ex1;

public class TestState {
	public static void main(String args[]) {
		Automat automat = new Automat(9);

		automat.gotApplication();
		automat.checkApplication();
		automat.rentApartment();
	}
}