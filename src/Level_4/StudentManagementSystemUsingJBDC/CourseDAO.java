package Level_4.StudentManagementSystemUsingJBDC;

import java.sql.*;
import java.util.Scanner;


public class CourseDAO {
    private static final Connection connection = DatabaseConnection.getConnection();
    private static final Scanner read = new Scanner(System.in);

    public void addCourse() throws SQLException{
        System.out.println("Enter Course name : ");
        String courseName = read.nextLine();
        System.out.println("Enter course credits : ");
        int credits = read.nextInt();
        read.nextLine();

        String sql = "INSERT INTO Courses (course_name, credits) VALUES (? ,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,courseName);
            statement.setInt(2, credits);
            statement.executeUpdate();
            System.out.println("Course added Successfully!");
        }
    }

    public  void viewCourses() throws SQLException{
        String sql = "SELECT * FROM Courses";
        try(Statement statement = connection.createStatement(); ResultSet rs = statement.executeQuery(sql)){
            System.out.println("\nID | Course Name | Credits");
            while(rs.next()){
                System.out.println(rs.getInt("id") + " | " + rs.getString("course_name") + " | " + rs.getInt("credits"));
            }
        }
    }
}
