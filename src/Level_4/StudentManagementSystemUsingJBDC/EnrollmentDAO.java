package Level_4.StudentManagementSystemUsingJBDC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EnrollmentDAO {
    private static final Connection connection = DatabaseConnection.getConnection();
    private static final Scanner read = new Scanner(System.in);

    public  void enrollStudent() throws SQLException{
        System.out.print("Enter the Student ID : ");
        int studentId = read.nextInt();
        System.out.println("Enter the Course ID : ");
        int courseId = read.nextInt();
        System.out.println("Enter grade (0.0 - 4.0) : ");
        double grade = read.nextDouble();
        read.nextLine();

        String sql = "Insert Into Enrollments (student_id, course_id, grade) Values(?, ? ,?) ";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,studentId);
            statement.setInt(2,courseId);
            statement.setDouble(3,grade);
            statement.executeUpdate();
            System.out.println("Enrollment Successful!");
        }
    }

    public void calculateGPA() throws SQLException{
        System.out.println("Enter Student ID : ");
        int studentId = read.nextInt();

        String sql = "SELECT AVG(grade) AS gpa FROM Enrollments WHERE student_id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, studentId);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()){
                    System.out.println(STR."GPA : \{rs.getDouble("gpa")}");
                }else{
                    System.out.println("No grades found");
                }
            }
        }
    }


}
