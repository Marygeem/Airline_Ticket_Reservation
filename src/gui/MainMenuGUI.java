package gui;

import javax.swing.*;
import java.awt.*;

public class MainMenuGUI extends JFrame {

    public MainMenuGUI(){

        setTitle("Airline Booking System");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240,240,240));


        setLayout(new GridLayout(4,1,20,20));

        JLabel title = new JLabel("✈ Airline Booking System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title);

        JButton searchFlights = new JButton("Search Flights");
        searchFlights.setBackground(new Color(30,144,255));
        searchFlights.setForeground(Color.WHITE);
        searchFlights.setFont(new Font("Arial", Font.BOLD, 16));
        searchFlights.setPreferredSize(new Dimension(200,50));
        searchFlights.addActionListener(e -> new SearchFlightGUI());



        JButton bookTicket = new JButton("Book Ticket");
        bookTicket.setBackground(new Color(30,144,255));
        bookTicket.setForeground(Color.WHITE);
        bookTicket.setFont(new Font("Arial", Font.BOLD, 16));
        bookTicket.setPreferredSize(new Dimension(200,50));
        bookTicket.setFocusPainted(false);
        bookTicket.addActionListener(e -> new SeatSelectionGUI());


        JButton adminPanel = new JButton("Admin Panel");
        adminPanel.setBackground(new Color(30,144,255));
        adminPanel.setForeground(Color.WHITE);
        adminPanel.setFont(new Font("Arial", Font.BOLD, 16));
        adminPanel.setPreferredSize(new Dimension(200,50));
        adminPanel.setFocusPainted(false);
        add(searchFlights);
        add(bookTicket);
        add(adminPanel);

        setVisible(true);
    }
}
