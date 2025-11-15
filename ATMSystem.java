class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
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

public class ATMSystem {
    public static void main(String[] args) {
        Account acc = new Account(5000);

        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(2000);
        System.out.println("After Deposit: " + acc.getBalance());

        if (acc.withdraw(3000))
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Insufficient Balance");

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
