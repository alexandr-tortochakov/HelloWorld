public class AverageOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        double averageSum = getAverage(array);
        System.out.print(averageSum);
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        int count = 0;
        for (int anArray : array) {
            if (anArray % 2 == 0) {
                sum += anArray;
                count++;
            }
        }
        return (double) sum / count;
    }
}
