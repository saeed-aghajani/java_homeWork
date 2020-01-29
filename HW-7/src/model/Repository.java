package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Entity> select() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:xe", "saeed", "aqa1234");

         PreparedStatement preparedStatement=connection.prepareStatement ("SELECT * FROM cars");
                ResultSet resultSet=preparedStatement.executeQuery ();
        List<Entity> list=new ArrayList <> ();
        while (resultSet.next ()){
            Entity entity =new Entity (); // call by reference
            entity.setName (resultSet.getString ("name"));
            entity.getColor ();
            entity.getPrice ();
            entity.getWeight ();

            list.add (entity);
        }
        return list;
    }

    public  void delete( String name){
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "saeed", "aqa1234");
            PreparedStatement delete = connection.prepareStatement("DELETE  FROM  cars WHERE  name=?");
            delete.setString(1,name);
            delete.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
