package gui;

import javax.swing.*;
import java.awt.*;

public class SeatSelectionGUI extends JFrame {

    public SeatSelectionGUI(){

        setTitle("Seat Selection");
        setSize(400,400);
        setLayout(new GridLayout(6,4,10,10));

        for(char row='A'; row<='F'; row++){

            for(int col=1; col<=4; col++){

                JButton seat = new JButton(row + "" + col);

                seat.addActionListener(e -> {

                    if(seat.getBackground() == Color.RED){
                        JOptionPane.showMessageDialog(this,"Seat already reserved!");
                    }
                    else{
                        seat.setBackground(Color.RED);
                        new PassengerFormGUI();
                    }

                });

                add(seat);

            }
        }

        setVisible(true);
    }
}
