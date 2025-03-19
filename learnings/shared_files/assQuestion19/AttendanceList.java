package assQuestion19;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceList {
    public static void main(String[] args) {
        // Create ArrayLists for Division A and B attendance
        ArrayList<String> divisionA = new ArrayList<>();
        ArrayList<String> divisionB = new ArrayList<>();
        ArrayList<String> consolidatedList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Mark attendance for Division A
        System.out.println("Enter the number of students present in Division A:");
        int aCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter names of students present in Division A:");
        for (int i = 0; i < aCount; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            divisionA.add(name);
        }

        // Mark attendance for Division B
        System.out.println("\nEnter the number of students present in Division B:");
        int bCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter names of students present in Division B:");
        for (int i = 0; i < bCount; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            divisionB.add(name);
        }

        // Combine both lists into the consolidated list
        consolidatedList.addAll(divisionA);
        consolidatedList.addAll(divisionB);

        // Display the consolidated list
        System.out.println("\nConsolidated Attendance List:");
        for (String student : consolidatedList) {
            System.out.println(student);
        }

        scanner.close();
    }
}
