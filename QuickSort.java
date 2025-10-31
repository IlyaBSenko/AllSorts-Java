public class QuickSort {


    public static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return; // base case
        }
    }






    public static void main(String[] args) {

        int[] array = {3, 4, 6, 7, 8, 5, 3, 4, 56, 7, 8, 6, 4, 3, 2, 2, 3, 5, 6, 7};

        quickSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
