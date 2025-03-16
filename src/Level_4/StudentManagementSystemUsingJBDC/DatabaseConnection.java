package Level_4.StudentManagementSystemUsingJBDC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "Eudaimonia";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e){
            throw new RuntimeException("Database connection failed!");
        }
    }

}
