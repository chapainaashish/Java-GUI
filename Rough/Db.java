package Rough;

import java.sql.*;


public class Db {
    Db() throws ClassNotFoundException, SQLException {
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://loclahoslt");

           // Static statement
           Statement stmt1 = connection.createStatement();

           stmt1.executeQuery("Select * from user");
           stmt1.executeUpdate("hi");


           // PreparedStatement

            PreparedStatement stmt2 = connection.prepareStatement("? ?");
            stmt2.setInt(1, 1);


            stmt2.executeUpdate();





    }
}
