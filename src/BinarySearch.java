public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 23, 44, 55};
        int x = binarySearch(array,  11);
        System.out.print(x);
    }

    public static int binarySearchRec(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;

        if (a[middle] == x) {
            return middle;
        }

        if (x < a[middle]) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
        return binarySearchRec(a, left, right, x);
    }

    public static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (a[middle] == x) {
                return middle;
            }

            if (x < a[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
