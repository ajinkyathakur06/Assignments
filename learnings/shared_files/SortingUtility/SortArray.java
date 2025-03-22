package assQuestion11;

public class SortArray implements SortingUtility {

	private int[] array;

    public SortArray(int[] array) {
        this.array = array;
    }

    @Override
    public void ascendingSort() {
        java.util.Arrays.sort(array);
        System.out.println("Ascending order: " + java.util.Arrays.toString(array));
    }

    @Override
    public void descendingSort() {
        java.util.Arrays.sort(array);
        int[] descendingArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            descendingArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Descending order: " + java.util.Arrays.toString(descendingArray));
    }

}
