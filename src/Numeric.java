import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int inputNumber = scanner.nextInt();

        int sum = 0;
        int sumOfOdd = 0;
        int max = -1;
        int number = inputNumber;

        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum += digit;
            if (digit % 2 != 0) {
                sumOfOdd += digit;
            }
            if (digit > max) {
                max = digit;
            }
        }
        System.out.println("Сумма цифр числа = " + sum);
        System.out.println("Сумма нечетных чисел числа = " + sumOfOdd);
        System.out.print("Максимальная цифра числа = " + max);
    }
}
