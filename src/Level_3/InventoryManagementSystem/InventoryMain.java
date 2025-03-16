package Level_3.InventoryManagementSystem;

import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();
        Scanner read = new Scanner(System.in);
        System.out.println("\nInventory Management System");
        while(true){
            System.out.println("\n1. Add Product \n2.Remove Product \n3.Add Order \n4.Process Order \n5.Display Inventory" +
                    "\n6.Display Orders\n7.Exit");
            System.out.print("Choose an option : ");
            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Product Name : ");
                    inventoryManagement.addProduct(read.nextLine());
                    break;

                case 2:
                    inventoryManagement.removeProduct();
                    break;
                case 3:
                    System.out.print("Enter the Customer's Name :  ");
                    String customer = read.nextLine();
                    System.out.println("Enter the Product Name : ");
                    String product = read.nextLine();
                    inventoryManagement.addOrder(customer,product);
                    break;
                case 4:
                    inventoryManagement.processOrder();
                    break;
                case 5:
                    inventoryManagement.displayInventory();
                    break;
                case 6:
                    inventoryManagement.displayOrders();
                    break;
                case 7:
                    System.out.println("\nExiting ...");
                    return;
                default:
                    System.out.println("Invalid choice! Try Again");
            }
        }
    }
}
