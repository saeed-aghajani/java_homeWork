import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database
{
    public Database() {
    }

    public void insert(int id, String name, int year, String avg)
    {
        try(Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into student1 (id,name,year,average) values (?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,year);
            preparedStatement.setString(4,avg);
            preparedStatement.execute();
            preparedStatement.close();

            System.out.println("insert successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void updateId(int id)
    {
        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("update student1(id) values (?)");
            preparedStatement.setInt(1,id);
            preparedStatement.close();
            System.out.println("updateid successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
    public void updateName(String name)
    {
        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("update into student1 (name) values (?)");
            preparedStatement.setString(2,name);
            preparedStatement.close();
            System.out.println("updateName successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
    public void updateYear(int year)
    {
        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("update into student1 (year) values (?)");
            preparedStatement.setInt(2,year);
            preparedStatement.close();
            System.out.println("updateYear successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
    public void updateAvrage(String avg)
    {
        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("update into student1 (average) values (?)");
            preparedStatement.setString(2,avg);
            preparedStatement.close();
            System.out.println("updateAverage successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }

    public void  Remove(int id,String name)
    {
        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saeed","saeed9092"))
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("delete From student1 where Id = ? or Name = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.close();
            System.out.println("Remove successfully");
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }


}
