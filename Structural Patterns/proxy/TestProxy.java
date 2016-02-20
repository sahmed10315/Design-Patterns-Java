package proxy;

public class TestProxy {
	AutomatProxy automatProxy;

	public static void main(String args[]) {
		TestProxy t = new TestProxy();
	}

	public TestProxy() {
		automatProxy = new AutomatProxy();

		automatProxy.gotApplication();
		automatProxy.checkApplication();
		automatProxy.rentApartment();
	}
}