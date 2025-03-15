package Level_2.TodoApplication;

import java.util.ArrayList;

public class TodoApplication {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
        System.out.println("Task added Successfully");
    }

    public void removeTask(int index){
        if(index >= 1 && index <= tasks.size()){
            tasks.remove(index -1);
            System.out.println("Task removed successfully! \n");
        }
        else{
            System.out.println("Invalid task Number\n");
        }
    }

    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks available! \n");
        }
        else{
            System.out.println("\nYour To-Do List:");
            for(int i = 0 ; i < tasks.size(); i++){
                System.out.println((i + 1) + "." + tasks.get(i));
            }
            System.out.println();
        }
    }

    public void clearAllTasks() {
        tasks.clear();
        System.out.println("All tasks cleared! \n");
    }
}


