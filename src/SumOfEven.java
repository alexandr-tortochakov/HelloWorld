public class SumOfEven {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int count = 0;
        while (i <= 17) {
            sum += i;
            i++;
            count++;
        }
        double average = (double)sum / count;
        System.out.println("Среднее арифметическое число = " + average);


        int even = 0;
        int sum1 = 0;
        int k = 3;
        while (k <= 17) {
            if (k % 2 == 0) {
                sum1 += k;
                even++;
            }
            k++;
        }
        double averageEven = (double)sum1 / even;
        System.out.print("Среднее арифметическое четных чисел = " + averageEven);
    }
}
