package assQuestion16;

import java.util.ArrayList;
import java.util.Scanner;

public class CulturalCommitteeApp {
	public static void main(String[] args) {
        // Create an ArrayList to store the names of volunteers
        ArrayList<String> volunteers = new ArrayList<>();

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Maximum number of volunteers allowed
        final int MAX_VOLUNTEERS = 15;

        System.out.println("Enter the names of volunteers. You can add up to " + MAX_VOLUNTEERS + " members.");

        // Loop to keep taking names until the limit is reached
        while (volunteers.size() < MAX_VOLUNTEERS) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            // Add the name to the ArrayList
            volunteers.add(name);
            System.out.println(name + " has been added. Total members: " + volunteers.size());
        }

        // Display the message once the threshold is reached
        System.out.println("No more candidates allowed as volunteers. Thank you.");

        // Optionally, display the final list of volunteers
        System.out.println("List of Volunteers:");
        for (String volunteer : volunteers) {
            System.out.println(volunteer);
        }

        // Close the scanner
        scanner.close();
    }
}
