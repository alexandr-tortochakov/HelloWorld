public class CheckSort {
    public static void main(String[] args) {
        System.out.println(isDecreasing(new int[]{9, 6, 6, 5, 4, 3, 2}));
        System.out.println(isIncreasing(new int[]{2, 4, 5, 6, 7, 8, 9}));
    }

    public static boolean isDecreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
