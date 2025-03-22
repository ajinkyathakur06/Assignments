package assQuestion24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Marathon {
	public static void main(String[] args) {
        // List to store marathon runners
        List<MarathonRunner> finishers = new ArrayList<>();

        // Adding runners to the list
        finishers.add(new MarathonRunner("Alice", 101, 9.00, 11.30));
        finishers.add(new MarathonRunner("Bob", 102, 9.05, 12.00));
        finishers.add(new MarathonRunner("Charlie", 103, 9.10, 10.45));

        // Sorting the list based on the finishing time
        Collections.sort(finishers, Comparator.comparingDouble(MarathonRunner::getFinishTime));

        // Display details of the first and last finishers
        System.out.println("First to finish:");
        finishers.get(0).displayDetails();

        System.out.println("\nLast to finish:");
        finishers.get(finishers.size() - 1).displayDetails();
    }
}
