import java.util.Arrays;

public class MinOfArray {
    public static void main(String[] args) {
        int[] array = {7, 4, 56, 7, 34, 6, 2, 38, 90};
        int index = findMin(0, array);
        System.out.println(index);

        int [] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(array));
    }

    public static int findMin(int start, int[] array) {
        int minIndex = start;
        int min = array[minIndex];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int x = findMin(i, array);
            int temp = array[i];
            array[i] = array[x];
            array[x] = temp;
        }
        return array;
    }
}
