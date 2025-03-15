package Level_1.BankAccount;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the Account Number : ");
        String accountNumber = read.nextLine();

        System.out.print("Enter the Account Holder Name : ");
        String accountName = read.nextLine();

        System.out.print("Enter the initial balance : ");
        Double balance = read.nextDouble();

        BankAccount bankAccount = new BankAccount(accountNumber, accountName, balance);

        while(true){
            System.out.println("\n<----Banking System---->\n");
            System.out.println("\t1. Deposit");
            System.out.println("\t2. Withdraw");
            System.out.println("\t3. Balance Info");
            System.out.println("\t4. Exit\n");
            System.out.print("Choose an option : " );

            int choice = read.nextInt();

            switch(choice){
                case 1 :
                    System.out.print("Enter the deposit Amount : ");
                    int depositAmount = read.nextInt();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the Amount to Withdraw : ");
                    int withdrawAmount = read.nextInt();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankAccount.displayAccount();
                    break;
                case 4:
                    System.out.println("Thank you for using our services.\nHave a Nice day");
                    read.close();
                    return;
                default:
                    System.out.println("Invalid Choice Please select again!");
            }
        }
    }
}
