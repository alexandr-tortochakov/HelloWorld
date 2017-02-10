public class DoWhileSum {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int count = 0;
        do {
            sum += i;
            i++;
            count++;
        } while (i <= 17);

        double average = (double)sum / count;
        System.out.println("Среднее арифметическое число = " + average);


        int k = 3;
        int sum1 = 0;
        int even = 0;
        do {
            if (k % 2 == 0) {
                sum1 += k;
                even++;
            }
            k++;
        } while (k <= 17);

        double averageEven = (double)sum1 / even;
        System.out.print("Среднее арифметическое четных чисел = " + averageEven);

    }
}
