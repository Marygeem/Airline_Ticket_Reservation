package gui;

import javax.swing.*;
import java.awt.*;

public class PassengerFormGUI extends JFrame {

    public PassengerFormGUI(){

        setTitle("Passenger Information");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,2,10,10));

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();

        JLabel passportLabel = new JLabel("Passport Number");
        JTextField passportField = new JTextField();


        JButton nextButton = new JButton("Continue to Payment");

        nextButton.addActionListener(e -> {

            String name = nameField.getText();
            String passport = passportField.getText();

            if(name.isEmpty() || passport.isEmpty()){
                JOptionPane.showMessageDialog(this,"Please fill all fields");
                return;
            }

            System.out.println("Passenger Name: " + name);
            System.out.println("Passport Number: " + passport);

            new PaymentGUI();

        });

        add(nameLabel);
        add(nameField);

        add(passportLabel);
        add(passportField);

        add(new JLabel(""));
        add(nextButton);

        setVisible(true);
    }
}

