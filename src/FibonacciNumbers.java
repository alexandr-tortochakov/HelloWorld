import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int inputNumber = scanner.nextInt();
        int result = numbers(inputNumber);
        System.out.print(result);

    }

    public static int numbers (int inputNumber) {
        int f0 = 0;
        int f1 = 1;
        if (inputNumber < 2) {
            f1 = inputNumber;
        }
        int i = 0;
        while (i < (inputNumber - 1)) {
            int x = f1;
            f1 = f1 + f0;
            f0 = x;
            i++;
        }
        return f1;
    }
}
