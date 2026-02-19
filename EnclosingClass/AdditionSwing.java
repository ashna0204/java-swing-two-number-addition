package EnclosingClass;

import javax.swing.*;
import java.awt.event.*;
public class AdditionSwing {
    
    JFrame frame;
    JLabel label1, label2, resultLabel;
    JTextField textField1, textField2;
    JButton addButton;

    public AdditionSwing(){
        frame  = new JFrame("Addition of two numbers");
        label1 = new JLabel("First Number: ");
        label2 = new JLabel("Second Number: ");
        resultLabel = new JLabel("Result: ");

        textField1 = new JTextField();
        textField2 = new JTextField();

        addButton  = new JButton("ADD");

        label1.setBounds(30, 30, 100, 25);
        textField1.setBounds(160, 30, 150, 25);

        label2.setBounds(30, 70, 120, 25);
        textField2.setBounds(160, 70, 150, 25);

        addButton.setBounds(160, 110, 100, 30);
        resultLabel.setBounds(30, 160, 250, 25);

        addButton.addActionListener(new AdditionHandler());

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class AdditionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e ){
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());

            int sum = num1 + num2 ;

            resultLabel.setText("Result: " + sum);
        }
    }

    public static void main(String[] args){
        new AdditionSwing();
    }
}
