import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        // begin at index 1
        // put index 1 at temp variable
        // examine with the elements to the left of it
        // if any of those elements are larger then it, then shift those elements to the right
        // place the item in temp in the opening
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }


    /**
     * Performs an insertion sort on the provided array.
     * Based on the OpenDSA textbook version, adapted for Comparable items.
     */
    public static <T extends Comparable<T>> void providedInsertionSort(T[] items) {

        for (int i = 1; i < items.length; i++) {
            T key = items[i];
            int j = i - 1;

            // Move elements of items[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && items[j].compareTo(key) > 0) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }


    /**
     * Performs an insertion sort only within the specified subrange of the array.
     * The subrange is defined by start and end indices (both inclusive).
     *
     * @param items the array containing the subrange to be sorted
     * @param start the starting index of the subrange (inclusive)
     * @param end   the ending index of the subrange (inclusive)
     */
    public static <T extends Comparable<T>> void insertSubsort(T[] items, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            T key = items[i];
            int j = i - 1;

            
            while (j >= start && items[j].compareTo(key) > 0) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }






    public static void main(String[] args) {

        int[] array = {5, 76, 8, 4, 2, 5, 7, 5, 3, 5, 7, 9, 8, 7, 4, 4, 5, 6, 8, 9, 6, 3, 4, 6, 7, 8, 9, 5, 23, 2, 3, 45, 6, 8, 9};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        Integer[] arr = {9, 4, 2, 8, 1, 6, 5};
        insertSubsort(arr, 1, 5);

        System.out.print(Arrays.toString(arr));
        // Expected output: [9, 1, 2, 4, 6, 8, 5]
    }
    
}
