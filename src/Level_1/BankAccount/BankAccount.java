package Level_1.BankAccount;

public class BankAccount {
    private String accountNumber;
    private String accountName;

    private Double balance;

    public BankAccount(String accountNumber, String accountName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.println(STR."$\{amount} deposited\n");
        }
        else{
            System.out.println("Invalid amount\n");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(STR."$\{amount} withdrawn\n");
        }
        else{
            System.out.println("Insufficient funds or Invalid amount\n");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void displayAccount(){
        System.out.println(STR."Account Number : \{accountNumber}");
        System.out.println(STR."Account Holder Name : \{accountName}");
        System.out.println(STR."Balance : \{getBalance()}\n");
    }

}
