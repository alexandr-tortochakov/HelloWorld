import java.util.Locale;
import java.util.Scanner;

public class PositiveAndEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("Данное число положительное");
        } else if (inputNumber < 0) {
            System.out.println("Данное число отрицательное");
        } else {
            System.out.println("Данное число равно 0");
        }

        if (inputNumber % 2 == 0 && inputNumber % 5 == 0 && inputNumber != 0) {
            System.out.println("Данное число кратно 2 и 5");
        } else if (inputNumber % 2 == 0 && inputNumber != 0) {
            System.out.println("Данное число четное");
        } else if (inputNumber % 5 == 0 && inputNumber != 0) {
            System.out.println("Данное число кратно 5");
        } else {
            System.out.println("Данное число не кратно ни 2, ни 5");
        }
    }
}
