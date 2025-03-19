package assQuestion20;

import java.util.ArrayList;
import java.util.Scanner;

public class SportsCoreTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ArrayLists for Football, Cricket, and SportsCoreTeam
        ArrayList<String> footballTeam = new ArrayList<>();
        ArrayList<String> cricketTeam = new ArrayList<>();
        ArrayList<String> sportsCoreTeam = new ArrayList<>();

        // Input Football team participants
        System.out.println("Enter the number of participants in the Football team:");
        int footballCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the names of Football team participants:");
        for (int i = 0; i < footballCount; i++) {
            footballTeam.add(scanner.nextLine());
        }

        // Input Cricket team participants
        System.out.println("Enter the number of participants in the Cricket team:");
        int cricketCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the names of Cricket team participants:");
        for (int i = 0; i < cricketCount; i++) {
            cricketTeam.add(scanner.nextLine());
        }

        // Find common participants and add them to SportsCoreTeam
        for (String player : footballTeam) {
            if (cricketTeam.contains(player)) {
                sportsCoreTeam.add(player);
            }
        }

        // Display the SportsCoreTeam
        System.out.println("Sports Core Team (participated in both Football and Cricket):");
        if (sportsCoreTeam.isEmpty()) {
            System.out.println("No players participated in both games.");
        } else {
            for (String player : sportsCoreTeam) {
                System.out.println(player);
            }
        }

        scanner.close();
    }
}
