package gui;

import javax.swing.*;
import java.awt.*;

public class PaymentGUI extends JFrame {

    public PaymentGUI(){

        setTitle("Payment");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,1,15,15));

        JLabel title = new JLabel("Select Payment Method", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JButton creditButton = new JButton("Credit Card");
        JButton cashButton = new JButton("Cash");
        JButton checkButton = new JButton("Check");

        creditButton.setBackground(new Color(30,144,255));
        creditButton.setForeground(Color.WHITE);

        cashButton.setBackground(new Color(30,144,255));
        cashButton.setForeground(Color.WHITE);

        checkButton.setBackground(new Color(30,144,255));
        checkButton.setForeground(Color.WHITE);

        creditButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Credit Card Payment Successful");
            new ConfirmationGUI();
        });

        cashButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Cash Payment Successful");
            new ConfirmationGUI();
        });

        checkButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Check Payment Successful");
            new ConfirmationGUI();
        });

        add(title);
        add(creditButton);
        add(cashButton);
        add(checkButton);

        setVisible(true);
    }
}
