package assQuestion10;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void listAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + (i + 1) + ": " + accounts.get(i).getClass().getSimpleName());
        }
    }
}
