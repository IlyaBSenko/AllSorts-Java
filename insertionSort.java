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



    public static void main(String[] args) {

        int[] array = {5, 76, 8, 4, 2, 5, 7, 5, 3, 5, 7, 9, 8, 7, 4, 4, 5, 6, 8, 9, 6, 3, 4, 6, 7, 8, 9, 5, 23, 2, 3, 45, 6, 8, 9};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
