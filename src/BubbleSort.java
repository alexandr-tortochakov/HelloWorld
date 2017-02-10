import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {457, 4, 56, 7, 34, 6, 2, 38, 90, 4};
        int[] sortedArray = sort(array);
        System.out.print(Arrays.toString(sortedArray));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sort(int[] array) {
        boolean swapped = true;
        int end = 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - end; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            end++;
        }
        return array;
    }
}
