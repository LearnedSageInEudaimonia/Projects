package Level_2.LibraryManagementSystem;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner read = new Scanner(System.in);

        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("The Power of Your Subconscious Mind","Dr. Joseph Murphy"));
        library.addBook(new Book("Atomic Habits", "James Clear"));

        while(true){
            System.out.println("\n-------LIBRARY SYSTEM-------");
            System.out.println("\n1. Show Books \n2. Borrow Book \n3. Return Book \n4. Exit\n ");
            System.out.print("Enter choice : ");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice){
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.println("Enter the title to borrow : ");
                    String title = read.nextLine();
                    library.borrowBook(title);
                    break;
                case 3:
                    System.out.println("Enter the title to borrow : ");
                    String title1 = read.nextLine();
                    library.returnBook(title1);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid Choice! Select Again");
            }
        }
    }
}
