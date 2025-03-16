package Level_4.ATM;

import java.sql.SQLException;
import java.util.Scanner;

public class ATMService {
    private final AccountDAO accountDAO;
    private final TransactionDAO transactionDAO;
    private final Scanner scanner;

    public ATMService() {
        this.accountDAO = new AccountDAO();
        this.transactionDAO = new TransactionDAO();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        try {
            if (accountDAO.authenticateUser(username, pin)) {
                System.out.println("Login Successful!");
                menu(username);
            } else {
                System.out.println("Invalid Credentials!");
            }
        } catch (SQLException e) {
            System.out.println(STR."Error: \{e.getMessage()}");
        }
    }

    private void menu(String username) {
        while (true) {
            System.out.println("\n1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1 -> System.out.println(STR."Current Balance: ₹\{accountDAO.getBalance(username)}");
                    case 2 -> depositMoney(username);
                    case 3 -> withdrawMoney(username);
                    case 4 -> transactionDAO.getTransactionHistory(username);
                    case 5 -> {
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.out.println(STR."Error: \{e.getMessage()}");
            }
        }
    }

    private void depositMoney(String username) throws SQLException {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        double newBalance = accountDAO.getBalance(username) + amount;
        accountDAO.updateBalance(username, newBalance);
        transactionDAO.recordTransaction(username, "Deposit", amount);
        System.out.println(STR."Deposit successful! New Balance: ₹\{newBalance}");
    }

    private void withdrawMoney(String username) throws SQLException {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        double currentBalance = accountDAO.getBalance(username);

        if (amount > currentBalance) {
            System.out.println("Insufficient funds!");
            return;
        }

        double newBalance = currentBalance - amount;
        accountDAO.updateBalance(username, newBalance);
        transactionDAO.recordTransaction(username, "Withdraw", amount);
        System.out.println("Withdrawal successful! New Balance: ₹" + newBalance);
    }
}

