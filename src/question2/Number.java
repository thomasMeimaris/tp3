package question2;


public class Number extends Observable{

    public int getValue() {
        return this.value;
    }

    public void setValue(int p_value) {
        this.value = p_value;
        this.notifyObserver();
        System.out.println("valeur : " + p_value);
    }

    private int value;

    public Number(){
        this.value = 0;
    }

    public void increment(){
        this.setValue(this.getValue() + 1);
    }

    public void decrement(){
        this.setValue(this.getValue() -1 );
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.observerList){
            observer.update(Integer.toString(this.value));
        }
    }

}
