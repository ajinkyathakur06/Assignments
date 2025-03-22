package assQuestion8;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accountList = new ArrayList<>();

        // Accept data for 10 account holders
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for account holder " + i + ":");
            System.out.print("Account Number: ");
            int acc_no = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Account Type: ");
            String acc_type = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();

            // Create an account object and add it to the list
            accountList.add(new Account(acc_no, acc_type, name, balance));
        }

        // Print names of customers having balance greater than 10,000
        System.out.println("\nCustomers with balance greater than 10,000:");
        for (Account account : accountList) {
            if (account.getBalance() > 10000) {
                System.out.println(account.getName());
            }
        }

        sc.close();
    }
}
