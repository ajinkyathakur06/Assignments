package assQuestion11;

public class SortingUtilityDemo {
	public static void main(String[] args) {
        // Test with an array
        int[] numbers = {5, 3, 8, 1, 2};
        SortArray sortArray = new SortArray(numbers);
        System.out.println("Sorting Array:");
        sortArray.ascendingSort();
        sortArray.descendingSort();

        // Test with a string
        String inputString = "Apple";
        SortString sortString = new SortString(inputString);
        System.out.println("\nSorting String:");
        sortString.ascendingSort();
        sortString.descendingSort();
    }
}
