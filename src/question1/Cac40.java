package question1;

public class Cac40  extends Observable{

    public Cac40(){
        super();
    }

    /***
     * J'ai choisi de rendre cette méthode abstraite, car nous pourrions supposer que son implémentation
     * nécessiterait des controles. Exemple n'avertir qu'un certain nombre d'observer.
     */
    @Override
    protected void notifyObserver() {
       for(Observer obs : this.observerList){
           obs.update();
       }
    }
}
