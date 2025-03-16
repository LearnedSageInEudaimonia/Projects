package Level_3.InventoryManagementSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InventoryManagement {
    private Stack<String> stock = new Stack<>();
    private Queue<String> orders = new LinkedList<>();

    public void addProduct(String product){
        stock.push(product);
        System.out.println(STR."\{product} added to inventory.");
    }

    public void removeProduct(){
        if(!stock.isEmpty()){
            System.out.println(STR."\{stock.pop()} removed from inventory.");
        }else{
            System.out.println("Inventory is empty!");
        }
    }

    public void addOrder(String customer, String product){
        orders.add(STR."\{customer} ordered \{product}");
        System.out.println(STR."Order added : \{customer} -> \{product}");
    }

    public void processOrder() {
        if (!orders.isEmpty()){
            System.out.println(STR."Processing \{orders.poll()}");
        }else{
            System.out.println("No pending orders.");
        }
    }

    public void displayInventory(){
        System.out.println(STR."\nCurrent Inventory : \{stock}");
    }

    public void displayOrders(){
        System.out.println(STR."Pending Order : \{orders}");
    }

}
