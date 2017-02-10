import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {777, 57, 85, 888, 0, 78, 56, 89, 565, 22, 999, -1};
        sort(array, 0, array.length - 1);
        System.out.print(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        if (right - left == 1) {
            if (array[right] < array[left]) {
                swap(array, right, left);
            }
            return;
        }
        int x = array[left];
        int i = left;
        int j = right;
        while (i <= j) {
            while (i <= right && array[i] < x) {
                i++;
            }
            while (j >= left && array[j] > x) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (i < right) {
        sort(array, i, right);
        }
        if (j > left) {
        sort(array, left, j);
        }
    }
}
