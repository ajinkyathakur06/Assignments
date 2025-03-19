package assQuestion10;

public class BankingSystem {
	public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\n--- Banking Operations ---");

        savingsAccount.deposit(200);
        savingsAccount.withdraw(300);
        System.out.println("SavingsAccount Interest: " + savingsAccount.calculateInterest());
        savingsAccount.viewBalance();

        currentAccount.deposit(100);
        currentAccount.withdraw(700);
        currentAccount.calculateInterest();
        currentAccount.viewBalance();

        System.out.println("\n--- List of Accounts in the Bank ---");
        bank.listAccounts();
    }
}
