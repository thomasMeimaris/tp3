package question2;

public class main {

    public static void main(String args[]){
        System.out.println("dans le main");
        Number model = new Number();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        controller.display();
    }

}
