package chainofresponsibility.ex2;

public abstract class PurchasePower {
	protected static final double BASE = 500;
	protected PurchasePower successor;

	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}

	abstract public void processRequest(PurchaseRequest request);
}