package assQuestion11;

public class SortString implements SortingUtility {
	private String str;

    public SortString(String str) {
        this.str = str;
    }

    @Override
    public void ascendingSort() {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        System.out.println("Ascending order: " + new String(charArray));
    }

    @Override
    public void descendingSort() {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        StringBuilder descending = new StringBuilder(new String(charArray)).reverse();
        System.out.println("Descending order: " + descending);
    }
}
