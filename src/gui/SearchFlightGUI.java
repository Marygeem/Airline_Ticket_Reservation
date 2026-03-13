package gui;

import javax.swing.*;
import java.awt.*;

public class SearchFlightGUI extends JFrame {

    public SearchFlightGUI(){

        setTitle("Search Flights");
        setSize(600,400);
        setLocationRelativeTo(null);

        String[] columns = {"Flight", "From", "To", "Departure"};

        String[][] data = {
                {"F101","Tashkent","Dubai","10:30"},
                {"F202","Tashkent","Seoul","14:00"},
                {"F303","Tashkent","Istanbul","18:20"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane scroll = new JScrollPane(table);

        add(scroll);

        setVisible(true);
    }
}
