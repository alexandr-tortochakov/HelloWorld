public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int[][] table = createMultiTable(20);
        printTable(table);
    }

    public static int[][] createMultiTable(int limit) {
        int[][] array = new int[limit][limit];
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void printTable(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}

