public class WhileSum {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int even = 0;
        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                even++;
            }
            i++;
        }
        System.out.println("Сумма четных чисел = " + sum);
        System.out.print("Количество четных чисел = " + even);
    }
}
