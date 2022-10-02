package CountingApp.listener;

import org.mariuszgromada.math.mxparser.Expression;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EqualsButtonListener implements ActionListener {


    private JTextField inputField;

    public EqualsButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double a,b;

        Expression expression = new Expression(inputField.getText());

        a = (int)expression.calculate();
        b = expression.calculate();



        if(a == b){
            inputField.setText(String.valueOf((int)expression.calculate()));
        } else {
            inputField.setText(String.valueOf(expression.calculate()));
        }


    }
}

