import java.util.*;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
class ATM {
    private BankAccount account;
    public ATM(BankAccount bankAccount) {
        account = bankAccount;
    }
    public void displayMenu() {
        System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Balance: " + account.getBalance());
            } else if (choice == 2) {
                System.out.print("Deposit amount: ");
                account.deposit(scanner.nextDouble());
            } else if (choice == 3) {
                System.out.print("Withdraw amount: ");
                if (account.withdraw(scanner.nextDouble())) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
public class ATMMACHINE {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
