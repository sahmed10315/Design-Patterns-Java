package chainofresponsibility.ex2;

/* To create a chain of objects, all objects which will be a part of chain extend this abstract class */
public abstract class PurchasePower {
	protected static final double BASE = 500;
	protected PurchasePower successor; // Next in chain
	
	/* Each chainable subclass object, carries the successor object in the chain as its field */
	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}

	abstract public void processRequest(PurchaseRequest request);
}