package question1;

public class Cac40  extends Observable{

    private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
        super.notifyObserver();
    }

    public Cac40(){
        super();
    }
}
