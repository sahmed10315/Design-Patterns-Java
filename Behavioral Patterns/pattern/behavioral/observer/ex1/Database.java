package pattern.behavioral.observer.ex1;

import java.util.*;

public class Database implements Subject {
	private Vector<Observer> observers;
	private String operation;
	private String record;

	public Database() {
		observers = new Vector<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
			Observer observer = (Observer) observers.get(loopIndex);
			observer.update(operation, record);
		}
	} 
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}
}