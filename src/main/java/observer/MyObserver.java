package observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

	MyObservable myObservable;
	@Override
	public void update(Observable o, Object arg) {
		
		myObservable = (MyObservable) o;
		System.out.println("the name value bacame: " + myObservable.getName());
	}
	
    public static void main(String[] args){
    	MyObserver observer = new MyObserver();
    	MyObservable observable = new MyObservable(null);
    	observable.addObserver(observer);
    	observable.setName("taher abdo");
    	observable.setName("osama abdo");
    }

}
