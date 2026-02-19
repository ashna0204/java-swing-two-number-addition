package ExplicitClass;


import javax.swing.*;
import java.awt.event.*;

public class AdditionListener implements ActionListener {

    JTextField textField1;
    JTextField textField2;
    JLabel resultLabel;

    public AdditionListener(JTextField t1, JTextField t2, JLabel resultLabel){
        this.textField1  = t1;
        this.textField2  = t2;
        this.resultLabel = resultLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        int sum  = num1 + num2;
        resultLabel.setText("Result: " + sum);

    }
}
