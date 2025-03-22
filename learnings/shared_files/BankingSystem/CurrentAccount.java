package assQuestion10;

public class CurrentAccount implements Account {

	private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into CurrentAccount.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount >= -overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CurrentAccount.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        System.out.println("CurrentAccount does not earn interest.");
        return 0;
    }

    @Override
    public void viewBalance() {
        System.out.println("CurrentAccount Balance: " + balance);
    }

}
