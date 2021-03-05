package question2;

import javax.swing.text.TextAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Number model;
    private View view;

    public Controller (Number p_model, View p_view){
        this.model = p_model;
        this.view = p_view;
    }

    public void display(){

        this.view.getjButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control('+');
            }
        });
        this.view.getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control('-');
            }
        });

        this.view.getjTextField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringValue = view.getjTextField().getText();
                control(Integer.valueOf(stringValue));
            }
        });

    }

    private void control(char p_signe){
        switch (p_signe){
            case '+':
                this.model.increment();
                break;
            case '-':
                this.model.decrement();
                break;
            default:
                System.out.println("mauvaise utilisation de la fonction !");
                break;
        }
    }

    private void control(int p_value){
        this.model.setValue(p_value);
    }

}
