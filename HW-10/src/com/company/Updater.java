package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updater extends Thread {
    public void update() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "saeed","aqa1234");
        PreparedStatement preparedStatement = connection.prepareStatement("Update karmand Set knumber='09220682865' Where kid = '1'");

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
    public void run(){
        try {
            update();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
