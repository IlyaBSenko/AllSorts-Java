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




    public static void main(String[] args) {

        int[] array = {5, 76, 8, 4, 2, 5, 7, 5, 3, 5, 7, 9, 8, 7, 4, 4, 5, 6, 8, 9, 6, 3, 4, 6, 7, 8, 9, 5, 23, 2, 3, 45, 6, 8, 9};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
