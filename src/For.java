public class For {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(System.lineSeparator());


        int n = 16;
        for (int i = 1; i <= n; i++) {
            System.out.print(Math.pow(i, 2) + " ");
        }
        System.out.print(System.lineSeparator());

        int even = 0;
        int sum = 0;
        for (int i = 5; i <= 46; i++) {
            if (i % 2 == 0) {
                sum += i;
                even++;
            }
        }
        double average = (double)sum / even;
        System.out.print("Среднее арифметическое четных чисел = " + average);
    }
}
