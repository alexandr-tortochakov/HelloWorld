import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {233553, 67, 345, 0, 768, 5, 67, 84, -24442};
        int[] newArray = sort(array);
        System.out.print(Arrays.toString(newArray));
    }

//    public static void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[i] < array[j - 1]) {
                j--;
            }
            int temp = array[i];
            for (int k = i; k > j; k--) {
                array[k] = array[k - 1];
            }
            array[j] = temp;
        }
        return array;
    }
}
