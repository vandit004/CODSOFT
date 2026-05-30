public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);

    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
    }

    public double getBalance() {
        return balance;
    }
}