package gui;

import javax.swing.*;
import java.awt.*;

public class ConfirmationGUI extends JFrame {

    public ConfirmationGUI(){

        setTitle("Reservation Confirmation");
        setSize(400,250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel message = new JLabel("Reservation Successful!", SwingConstants.CENTER);
        message.setFont(new Font("Arial", Font.BOLD, 22));
        message.setForeground(new Color(0,128,0));

        JLabel details = new JLabel("Your booking has been completed.", SwingConstants.CENTER);

        JButton finishButton = new JButton("Finish");

        finishButton.addActionListener(e -> {
            dispose();
        });

        add(message, BorderLayout.NORTH);
        add(details, BorderLayout.CENTER);
        add(finishButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
