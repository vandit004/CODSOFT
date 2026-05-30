public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        System.out.println("Current Balance: Rs. " + account.getBalance());

        account.deposit(500);

        System.out.println("Balance After Deposit: Rs. " + account.getBalance());
    }
}