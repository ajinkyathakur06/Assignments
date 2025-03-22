package assQuestion10;

public class SavingsAccount implements Account {

	private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into SavingsAccount.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from SavingsAccount.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    @Override
    public void viewBalance() {
        System.out.println("SavingsAccount Balance: " + balance);
    }
}
