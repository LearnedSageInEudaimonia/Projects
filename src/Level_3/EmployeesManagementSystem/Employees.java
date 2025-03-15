package Level_3.EmployeesManagementSystem;

import java.time.LocalDate;

public class Employees {
    private int id;
    private String name;
    private String department;
    private LocalDate joiningDate;

    public Employees(int id, String name, String department, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.joiningDate = joiningDate;
    }
    @Override
    public String toString(){
        return String.format("ID: %d | Name : %s | Department: %s | Joined : %s", id, name, department,joiningDate);

    }
    public int getId(){
        return id;
    }

}
