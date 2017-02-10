public class MaxOfArray {
    public static void main(String[] args) {
        int[] array = {-2, -435, -6, -4, -2553, -634, -887, -2356, -1};
        int maxOfArray = findMax(array);
        System.out.print(maxOfArray);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }
}
