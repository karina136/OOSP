package Task5;

import java.util.ArrayList;
import java.util.List;

public class Calendar implements Observed{
    List<Observer> subscribers = new ArrayList<>();
    public void addEvent (String event){
        System.out.println(event);;
        notifyObservers(event);
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : subscribers){
            observer.updateEvent(event);
        }
    }
}
