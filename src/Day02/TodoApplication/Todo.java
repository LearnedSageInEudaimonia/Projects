package Day02.TodoApplication;

import java.util.Scanner;

public class Todo {
    public static  void main(String[] args){
        Scanner read = new Scanner(System.in);
        TodoApplication todoApplication = new TodoApplication();

        while(true){
            System.out.println("-----To-Do List------");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Clear All Tasks");
            System.out.println("5. Exit");
            System.out.println("Choose an Option from the above : ");

            int choice = read.nextInt();
            read.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter Task : ");
                    String task = read.nextLine();
                    todoApplication.addTask(task);
                    break;
                case 2:
                    System.out.println("Enter Task Number to Remove : ");
                    int taskIndex = read.nextInt();
                    todoApplication.removeTask(taskIndex);
                    break;
                case 3 :
                    todoApplication.viewTasks();
                    break;
                case 4:
                    todoApplication.clearAllTasks();
                    break;
                case 5:
                    System.out.println("Exiting To-Do List.");
                    return;
                default:
                    System.out.println("Invalid option! Try again.\n");
            }
        }
    }

}
