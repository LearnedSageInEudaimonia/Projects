package Level_4.StudentManagementSystemUsingJBDC;


import java.sql.SQLException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws SQLException {
        Scanner read = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        final EnrollmentDAO enrollmentDAO = new EnrollmentDAO();


        System.out.println("\n=== STUDENT MANAGEMENT SYSTEM =a==");

        while (true) {
            System.out.println("\n1. Manage Students \n2. Manage Courses \n3. Enroll & Calculate GPA \n4. Exit");
            System.out.print("Select an Option: ");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1 -> manageStudents(read,studentDAO);
                case 2 -> manageCourses(read,courseDAO);
                case 3 -> enrollAndCalculateGPA(read,enrollmentDAO);
                case 4 -> {
                    System.out.println("Exiting...");
                    read.close();
                    return;
                }
                default -> System.out.println("Invalid choice! ");
            }
        }
    }

    private static void manageStudents(Scanner read, StudentDAO studentDAO) throws SQLException {
        while (true) {
            System.out.println("\n=== MANAGE STUDENTS ===");
            System.out.println("1. View Students \n2. Add Student \n3. Delete Student \n4. Exit");
            System.out.print("Select an Option: ");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1 -> studentDAO.viewStudents();
                case 2 -> studentDAO.addStudent();
                case 3 -> studentDAO.deleteStudent();
                case 4 -> {
                    System.out.println("Exiting Manage Students...");
                    return;  // Exits the method properly
                }
                default -> System.out.println("Invalid Choice, try again.");
            }
        }
    }

    private static void manageCourses(Scanner read, CourseDAO courseDAO) throws SQLException {
        while (true) {
            System.out.println("\n=== MANAGE COURSES ===");
            System.out.println("1. View Courses \n2. Add Course \n3. Exit");
            System.out.print("Select an Option: ");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1 -> courseDAO.viewCourses();
                case 2 -> courseDAO.addCourse();
                case 3 -> {
                    System.out.println("Exiting Manage Courses...");
                    return;  // Exits the method properly
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void enrollAndCalculateGPA(Scanner read, EnrollmentDAO enrollmentDAO) throws SQLException {
        while (true) {
            System.out.println("\n=== MANAGE COURSES ===");
            System.out.println("1. Enroll Student \n2. Calculate Gpa  \n3. Exit");
            System.out.print("Select an Option: ");
            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1 -> enrollmentDAO.enrollStudent();
                case 2 -> enrollmentDAO.calculateGPA();
                case 3 -> {
                    System.out.println("Exiting Manage Courses...");
                    return;  // Exits the method properly
                }
                default -> System.out.println("Invalid choice, try again.");
            }
    }


}
}
