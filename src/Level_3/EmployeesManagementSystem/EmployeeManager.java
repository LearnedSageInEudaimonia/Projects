package Level_3.EmployeesManagementSystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
    private final Map<Integer, Employees> employeesMap = new HashMap<>();

    private  final Scanner read = new Scanner(System.in);

    public void addEmployee(){
        try{
            System.out.println("Enter the Employee Id : ");
            int id = read.nextInt();
            read.nextLine();

            System.out.println("Enter Name : ");
            String name = read.nextLine();

            System.out.println("Enter Department : ");
            String department = read.nextLine();

            System.out.println("Enter Joining Date (YYYY- MM-DD");
            LocalDate joiningDate = LocalDate.parse(read.nextLine());

            Employees employees = new Employees(id, name, department,joiningDate);
            employeesMap.put(id, employees);
            System.out.println("✔\uFE0F Employee Added Successfully!\n");
        }catch (Exception e){
            System.out.println("Invalid Input! Try Again");
        }
    }
    public void displayEmployees() {
        if (employeesMap.isEmpty()) {
            System.out.println(" No Employees Found!\n");
            return;
        }
        System.out.println("\n Employee List:");
        for (Employees emp : employeesMap.values()) {
            System.out.println(emp);
        }
    }
    public void run() {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1 : addEmployee();
                         break;
                case 2 : displayEmployees();
                         break;
                case 3 : {
                    System.out.println("Exiting...");
                    return;
                }
                default : System.out.println(" Invalid Choice! Try Again.");
            }
        }
    }

    public static void main(String[] args) {
        new EmployeeManager().run();
    }

}
