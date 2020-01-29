package com.company;

import javax.swing.*;
import java.awt.*;

public class Show extends Thread {
    JFrame mainframe = new JFrame("Entekhabe Vahed");
    JPanel mainpanel = new JPanel(new BorderLayout(5,2));
    JPanel centerpanel = new JPanel(new GridLayout(6,1));
    JLabel title = new JLabel("",JLabel.CENTER);
    public void visiblity(){
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(600, 800);
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
        mainframe.add(mainpanel);
        mainpanel.add(centerpanel,BorderLayout.CENTER);
        mainpanel.add(title,BorderLayout.NORTH);
        title.setText("id=1 , name=saeed aqajani12345 , number=09220682865");
    }
    public void run(){
        visiblity();
    }

}
