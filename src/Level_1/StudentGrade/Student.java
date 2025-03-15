package Level_1.StudentGrade;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    private int totalSubjects;

    public Student(String name, int rollNumber, int totalSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalSubjects = totalSubjects;
        this.marks = new int[totalSubjects];
    }

    public void inputMarks(Scanner read){
        System.out.println();
        for(int i = 0 ; i < totalSubjects ; i++){
            while(true) {
                System.out.println(STR."Enter marks for subject: \{i + 1}: ");
                int enteredMarks = read.nextInt();
            if(enteredMarks >= 0  && enteredMarks <= 100){
                marks[i] = enteredMarks;
                break;
            }
            else{
                System.out.println("Invalid Marks!");
            }

            }
            }
    }
    public int calculateTotal(){
        int total = 0 ;
        for(int mark : marks){
            total += mark;
        }
        return total;
    }

    public double calculatePercentage(){
        return (double) calculateTotal() / totalSubjects;
    }

    public char calculateGrade(){
        double percentage = calculatePercentage();
        if(percentage >= 90) return 'A';
        else if(percentage >= 80) return 'B';
        else if(percentage >= 70) return 'C';
        else if(percentage >= 60) return 'D';
        else return 'F';
    }

    public void displayResults(){
        System.out.println(STR."\nStudent Name : \{name}");
        System.out.println(STR."Roll Number  : \{rollNumber}");
        System.out.println(STR."Total Marks  : \{calculateTotal()}");
        System.out.println(STR."Percentage   : \{String.format("%.2f",calculatePercentage())}");
        System.out.println(STR."Grade        : \{calculateGrade()}");
    }
}
