package question1;


import java.util.ArrayList;

public abstract class Observable {

    protected ArrayList<Observer> observerList;

    public Observable(){
        this.observerList = new ArrayList<Observer>();
    }

    public void add(Observer p_observer){
        this.observerList.add(p_observer);
    }

    public void remove(Observer p_observer) {
        this.observerList.remove(p_observer);
    }

    public int getObserverCount(){
        return this.observerList.size();
    }

    protected void notifyObserver(){
        for(Observer observer : this.observerList){
            observer.update();
        }
    }
}
