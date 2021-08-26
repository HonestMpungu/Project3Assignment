package ProgressBar;

import javax.swing.*;
import java.awt.*;

/*
Honest Mpungu
Student Number 215072081
Group 21
 */


public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,30);

    ProgressBar(){

        bar.setValue(0);
        bar.setBounds(0,0,400,100);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.green);
        bar.setBackground(Color.blue);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter =0;

        while(counter<=30) {

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter +=1;
        }
        bar.setString("Progress Mark! :)");
    }
}