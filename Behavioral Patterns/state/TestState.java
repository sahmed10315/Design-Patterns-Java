package state;

/* State pattern can be a cleaner way for an object to change its behavior at runtime without resorting to large monolithic conditional statements .
 * According to GOF it allows an object to alter its behavior when its internal state changes, thus the object will appear to change its class
 * */
public class TestState {
	public static void main(String args[]) {
		Automat automat = new Automat(9);

		automat.gotApplication();
		automat.checkApplication();
		automat.rentApartment();
	}
}