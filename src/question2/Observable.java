package question2;

import java.util.ArrayList;


public abstract class Observable {

    protected ArrayList<Observer> observerList;

    public Observable(){
        this.observerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer p_observer){
        this.observerList.add(p_observer);
    }

    public void removeObserver(Observer p_observer){
        this.observerList.remove(p_observer);
    }

    public int getObserverCount(){
        return this.observerList.size();
    }

    public abstract void notifyObserver();
}
