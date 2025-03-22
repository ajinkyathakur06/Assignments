package assQuestion18;

import java.util.*;

public class TechnologyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> technologies = new ArrayList<>();

        System.out.println("Enter the preferred technology of 15 students:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String technology = scanner.nextLine().trim();
            technologies.add(technology);
        }

        // Sort the ArrayList
        Collections.sort(technologies);

        System.out.println("\nTechnology Count:");
        String currentTechnology = "";
        int count = 0;

        for (String tech : technologies) {
            if (!tech.equals(currentTechnology)) {
                // Print the count of the previous technology
                if (count > 0) {
                    System.out.println(currentTechnology + ": " + count);
                }
                // Update current technology and reset count
                currentTechnology = tech;
                count = 1;
            } else {
                count++;
            }
        }

        // Print the count of the last technology
        if (count > 0) {
            System.out.println(currentTechnology + ": " + count);
        }

        scanner.close();
    }
}

