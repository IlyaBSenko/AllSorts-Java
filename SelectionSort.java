public class SelectionSort {

    public static void selectionSort(int[] array) {

        // start at index 0
        // compare with items to the right to find the minimum
        // find the minimum and put it in min variable
        // put index 0 in temp variable
        // put min in index 0
        // put temp in index + 1
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }


    /**
     * Performs a selection sort on the provided array.
     * This implementation is based on the OpenDSA textbook version,
     * adapted for Comparable items.
     */
    public static <T extends Comparable<T>> void providedSelectionSort(T[] items) {

        for (int i = 0; i <= items.length - 1; i++) { // Select i'th biggest record
            int bigindex = 0; // Current biggest index
            for (int j = 1; j < items.length - i; j++) { // Find the max value
                if (items[j].compareTo(items[bigindex]) > 0) { // Found something bigger
                    bigindex = j; // Remember bigger index
                }
            }
            swap(items, bigindex, items.length - i - 1); // Put it into place
        }
    }

    /**
     * Swaps elements with index i and index j in the provided array.
     */
    public static <T extends Comparable<T>> void swap(T[] items, int i, int j) {
        T tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }


    public static <T extends Comparable<T>> void selectSubsort(T[] items, int start, int end) {

        // Outer loop: move the boundary of the unsorted subrange leftward
        for (int i = end; i > start; i--) {
            int bigindex = start; // assume first element in subrange is largest

            // Find index of the largest element in [start..i]
            for (int j = start + 1; j <= i; j++) {
                if (items[j].compareTo(items[bigindex]) > 0) {
                    bigindex = j;
                }
            }

            // Swap the found largest element with the element at position i
            swap(items, bigindex, i);
        }
    }







    public static void main(String[] args) {

        int[] array = {5, 76, 8, 4, 2, 5, 7, 5, 3, 5, 7, 9, 8, 7, 4, 4, 5, 6, 8, 9, 6, 3, 4, 6, 7, 8, 9, 5, 23, 2, 3, 45, 6, 8, 9};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
