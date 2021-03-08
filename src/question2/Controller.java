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
                model.increment();
            }
        });
        this.view.getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.decrement();
            }
        });

        this.view.getjTextField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringValue = view.getjTextField().getText();
                model.setValue(Integer.valueOf(stringValue));
            }
        });
    }
}
