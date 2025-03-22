package assQuestion21;

import java.util.Vector;
import java.util.Collections;

public class TopThreeScorers {
    public static void main(String[] args) {
        // Vector to store scores
        Vector<Integer> scores = new Vector<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(65);
        scores.add(99);
        scores.add(91);
        scores.add(87);

        // Vector to store the top three scores
        Vector<Integer> topScores = new Vector<>();

        // Find top three scores
        for (int i = 0; i < 3; i++) {
            if (!scores.isEmpty()) {
                int maxScore = Collections.max(scores);
                topScores.add(maxScore);
                scores.remove((Integer) maxScore); // Remove the max score
            }
        }

        // Display the top three scores
        System.out.println("Top three scorers: " + topScores);
    }
}
