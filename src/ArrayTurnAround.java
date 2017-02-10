import java.util.Arrays;

public class ArrayTurnAround {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 5, 35, 2, 1, 8, 9};
        int [] changedArray = turnAround(array);
        System.out.print(Arrays.toString(changedArray));
    }

    public static int[] turnAround(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
