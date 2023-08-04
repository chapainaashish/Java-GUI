import java.sql.*;

public class JDBCout {
    JDBCout(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306");

            Statement stmt = connection.createStatement();


            String sql = "SELECT id, user FROM User";
            ResultSet resultSet = stmt.executeQuery(sql);


            while (resultSet.next()) {
                String user = resultSet.getString("user");
                int id = resultSet.getInt("id");

                System.out.println("User: " + user);
                System.out.println("Id: " + id);
            }



        }
        catch (Exception e){

        }

    }
}
