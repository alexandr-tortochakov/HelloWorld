public class FindIndex {
    public static void main(String[] args) {
        int[] array = {23, 3, 5, 6, 85, 36, 99, 89};
        int index = findNumber(334, array);
        System.out.print(index);
    }

    public static int findNumber(int inputNumber, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (inputNumber == array[i]) {
                return i;
            }
        }
        return -1;
    }
}