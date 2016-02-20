package state.ex1;

public class Automat implements AutomatInterface {
	private State waitingState;
	private State gotApplicationState;
	private State apartmentRentedState;
	private State fullyRentedState;
	private State state;
	private int count;

	public Automat(int n) {
		count = n;
		waitingState = new WaitingState(this);
		gotApplicationState = new GotApplicationState(this);
		apartmentRentedState = new ApartmentRentedState(this);
		waitingState = new WaitingState(this);
		state = waitingState;
	}

	@Override
	public void gotApplication() {
		System.out.println(state.gotApplication());
	}

	@Override
	public void checkApplication() {
		System.out.println(state.checkApplication());
	}

	@Override
	public void rentApartment() {
		System.out.println(state.rentApartment());
		System.out.println(state.dispenseKeys());
	}

	@Override
	public State getWaitingState() {
		return waitingState;
	}

	@Override
	public State getGotApplicationState() {
		return gotApplicationState;
	}

	@Override
	public State getApartmentRentedState() {
		return apartmentRentedState;
	}

	@Override
	public State getFullyRentedState() {
		return fullyRentedState;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int n) {
		count = n;
	}

	@Override
	public void setState(State s) {
		state = s;
	}
}
