class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Account acc = new Account("A101", "Hariss", 5000);

        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(1000);
        System.out.println("After Deposit: " + acc.getBalance());

        if (acc.withdraw(3000))
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Insufficient Balance");

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
