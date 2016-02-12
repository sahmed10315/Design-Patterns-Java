package pattern.behavioral.chainofresponsibility.ex2;

public class PresidentPPower extends PurchasePower {
	private final double ALLOWABLE = 60 * BASE;

	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE) {
			System.out.println("President will approve $" + request.getAmount());
		} else {
			System.out.println("Your request for $" + request.getAmount() + " needs a board meeting!");
		}
	}
}