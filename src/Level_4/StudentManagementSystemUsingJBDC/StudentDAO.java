package Level_4.StudentManagementSystemUsingJBDC;

import java.sql.*;
import java.util.Scanner;

public class StudentDAO {
    private static final Connection connection = DatabaseConnection.getConnection();
    private static final Scanner read = new Scanner(System.in);


      public  void addStudent() throws SQLException{
        System.out.print("Enter the Student Name : ");
        String name = read.nextLine();
        System.out.print("Enter Student Age : ");
        int age = read.nextInt();

        String sql = "INSERT INTO students (name, age) Values(? , ?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,name);
            statement.setInt(2, age);
            statement.executeUpdate();
            System.out.println("Student added successfully!");
        }
    }

    public  void viewStudents() throws SQLException{
        String sql = "SELECT * FROM students";
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)){
            System.out.println("\nID | Name | Age");
            while(rs.next()){
                System.out.println(STR."\{rs.getInt("id")} | \{rs.getString("name")} | \{rs.getInt("age")}");
            }
        }
    }

    public  void deleteStudent() throws SQLException{
        System.out.println("Enter student ID to delete : ");
        int id = read.nextInt();

        String sql = "DELETE FROM STUDENTS WHERE id = ? ";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,id);
            int affectedRows = statement.executeUpdate();
            if(affectedRows > 0){
                System.out.println("Student deleted");
            }else{
                System.out.println("Student not found ! ");
            }
        }
    }








}
