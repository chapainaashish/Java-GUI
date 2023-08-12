import java.sql.*;

public class JDBCout {
    JDBCout(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306");

            Statement stmt = connection.createStatement();


            String sql = "SELECT id, user FROM User";
            ResultSet resultSet = stmt.executeQuery(sql);

            // Create a multidimensional array to store the data
            int rowCount = 0;
            while (resultSet.next()) {
                rowCount++;
            }

            resultSet.beforeFirst(); // Move the cursor back to the beginning

            String[][] data = new String[rowCount][2]; // Assuming 2 columns: id and user



            int index = 0;
            while (resultSet.next()) {
                String user = resultSet.getString("user");
                int id = resultSet.getInt("id");

                System.out.println("User: " + user);
                System.out.println("Id: " + id);

                data[index][0] = Integer.toString(id);
                data[index][1] = user;
                index++;
            }



        }
        catch (Exception e){

        }

    }
}
