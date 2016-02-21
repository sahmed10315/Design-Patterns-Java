package mediator;

import java.io.*;

public class Purchase {
	Mediator mediator;
	String response = "n";

	public Purchase(Mediator m) {
		mediator = m;
	}

	public void go() {
		System.out.print("Buy the item now? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			System.out.println("Thanks for your purchase.");
		}

		mediator.handle("purchase.exit");
	}
}