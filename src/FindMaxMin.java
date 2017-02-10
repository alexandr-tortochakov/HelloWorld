public class FindMaxMin {
    public static int findMax (int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static int findMin (int x, int y) {
        return (x < y) ? x : y;
    }

    public static double getAverage (int begin, int end) {
        int sum = 0;
        int count = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
            count++;
        }
        return (double)sum / count;
    }

    public static void main(String[] args) {
        int max = findMax(23, 345);
        int min = findMin(35, 23);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        double average = getAverage(5, 10);
        System.out.print("Среднее арифметическое чисел: " + average);
    }
}
