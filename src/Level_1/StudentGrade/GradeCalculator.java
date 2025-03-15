package Level_1.StudentGrade;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("Enter Student Name : ");
            name = read.nextLine();

            if (name.matches("^[a-zA-Z]+(?: [a-zA-Z]+)*$")) {
                break;
            } else {
                System.out.println("Invalid name! ");
            }
        }
        System.out.print("Enter Roll Number : ");
        int rollNumber = read.nextInt();

        System.out.print("Enter Number of Subjects : ");
        int totalSubjects = read.nextInt();

        Student student = new Student(name, rollNumber, totalSubjects);
        student.inputMarks(read);

        student.displayResults();

        read.close();
    }

}
