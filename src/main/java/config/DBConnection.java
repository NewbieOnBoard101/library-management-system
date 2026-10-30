package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/library_management";
    private static final String userName = "root";
    private static final String passWord = "Nhi@290898";

    public static Connection getConnection() {
        try  {
            Connection con = DriverManager.getConnection(URL,userName,passWord);
            System.out.println("Connected to MySQL DB");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
