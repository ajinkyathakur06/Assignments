package assQuestion17;

import java.util.ArrayList;
import java.util.Scanner;

public class VolunteerBadgeApp {
	public static void main(String[] args) {
        ArrayList<String> historicalCharacters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        System.out.println("Welcome to the Volunteer Badge Icon Picker!");

        do {
            System.out.print("Enter the name of a historical character: ");
            String character = scanner.nextLine().trim();

            // Check if the character is already in the list
            if (historicalCharacters.contains(character)) {
                System.out.println("This character has already been chosen. Please pick another one.");
            } else {
                historicalCharacters.add(character);
                System.out.println(character + " has been added to your list of badge icons.");
            }

            // Ask if the user wants to continue
            System.out.print("Would you like to add another character? (yes/no): ");
            continueChoice = scanner.nextLine().trim().toLowerCase();

        } while (continueChoice.equals("yes"));

        // Display the final list of characters
        System.out.println("\nFinal list of historical characters:");
        for (String c : historicalCharacters) {
            System.out.println("- " + c);
        }

        scanner.close();
    }
}	
