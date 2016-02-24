package observer.ex2;

import java.util.Observable;
import java.util.Observer;

/* Observer class */
public class Canvas implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Canvas::update");
		// actual update code removed  
	}
}