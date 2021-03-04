package question1;

public class Cac40  extends Observable{

    public Cac40(){
        super();
    }

    @Override
    protected void notifyObserver() {
       for(Observer obs : this.observerList){
           obs.update();
       }
    }
}
