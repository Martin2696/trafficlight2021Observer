package trafficlight;

import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // Define an observer set to store all observer objects
    private final List<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Logout method, used to delete an observer in the observer set
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Declared notification method
    public void notifyObservers(State state) {
        for (Observer observer : observers)
            observer.update(state);
    }
}

