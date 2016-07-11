package observer;

import java.util.Observable;

public class MyObservable extends Observable{
	
	String name;

	public MyObservable(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

}
