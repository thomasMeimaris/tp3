package question1;

public class Broker implements Observer{

    private boolean changeDetected = false;

    public boolean isChangeDetected() {
        return this.changeDetected;
    }


    public Broker(){

    }

    @Override
    public void update() {
        this.changeDetected = true;
    }
}
