package com.company;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Frame {
    JFrame mainframe = new JFrame("Entekhabe Vahed");
    JPanel mainpanel = new JPanel(new BorderLayout(5,2));
    JPanel centerpanel = new JPanel(new GridLayout(6,1));
    JLabel title = new JLabel("Entekhabe Vahed",JLabel.CENTER);
    JTextField name = new JTextField();
    JTextField vahed = new JTextField();
    JButton Submit = new JButton("Submit ! ");

    public void Startup(){
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(600, 800);
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
        mainframe.add(mainpanel);
        mainpanel.add(centerpanel,BorderLayout.CENTER);
        mainpanel.add(title,BorderLayout.NORTH);
        title.setFont(new Font("aa",Font.PLAIN,40));
        centerpanel.add(name);
        name.setBorder(BorderFactory.createTitledBorder("enter your name"));
        centerpanel.add(vahed);
        centerpanel.add(Submit);
        vahed.setBorder(BorderFactory.createTitledBorder("vahed haye khod ra benevisid"));
        Submit.addActionListener(e-> {
            try {
                sender();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });
    }
    public void sender() throws SQLException, ClassNotFoundException {
        String Name=name.getText();
        String Vahed=vahed.getText();
        Name=Name+" "+Vahed;
        System.out.println(Name);
        database(Name);


    }
    public void database(String a ) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection =
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "saeed","aqa1234");
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into Vahed (vahed) values (?)");
        preparedStatement.setString(1, a);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();


    }


}
