package Theory;

import java.sql.*;

/*
executeQuery() ----- SELECT [return resultset in ResultSet data type]
executeUpdate() ------ UPDATE, DELETE, CREATE         JRadioButton radioButton1 = new JRadioButton("Radio Button 1");
[return num of row affected in int] 
 */
public class JDBCCrud {
    JDBCCrud(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jmc", "root", "pass");

            // Static Statement
            Statement stmt1 = connection.createStatement();
            String sql1 = "CREATE TABLE User(INT id, name VARCHAR(255));";
            stmt1.executeUpdate(sql1);

            // Dynamic(Prepared) Statement
            int id = 1;
            String name = "Aashish";

            String sql2 = "INSERT INTO User VALUES(?, ?);";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);

            stmt2.setInt(1, id);
            stmt2.setString(2, name);

            int rowsAffected = stmt2.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }

            stmt2.close();
            connection.close();

        }
        catch(Exception e){

        }
    }
}
